/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaul.sanchaksh.controller;

import com.kaul.sanchaksh.entity.Student;
import com.kaul.sanchaksh.service.ServiceImpl.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author sanch
 */
@Controller
public class StudentController {
    
    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    } //constructor
    
    @GetMapping("/studManagement")
    public String listStudents(Model model){
        model.addAttribute("student", studentService.getAllStudents());
        return "students";
    }
    
    @GetMapping("/studManagement/new")
    public String createStudent(Model model) {
        Student student =new Student();
        model.addAttribute("student", student);
        return "create_student";
    }
    
    @PostMapping("/studManagement")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/studManagement";        
    }
    
    @GetMapping("/studManagement/edit/{id}")
	public String editStudentForm(@PathVariable Long id, Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
    
        
    @PostMapping("/studManagement/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student") Student student,
			Model model) {
		
		// get student from database by id
		Student existingStudent = studentService.getStudentById(id);
		existingStudent.setId(id);
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		
		// save updated student object
		studentService.updateStudent(existingStudent);
		return "redirect:/studManagement";		
	}

	
	@GetMapping("/studManagement/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/studManagement";
	}
}
