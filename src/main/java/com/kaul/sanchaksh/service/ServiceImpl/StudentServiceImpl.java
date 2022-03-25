/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.kaul.sanchaksh.service.ServiceImpl;

import com.kaul.sanchaksh.entity.Student;
import com.kaul.sanchaksh.repository.StudentRepository;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author sanch
 */
@Service
public class StudentServiceImpl {
    
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        super();
        this.studentRepository = studentRepository;
    }//constructor
    
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }  //find all
    
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    } //save student
    
    public void deleteStudentById(Long id) {
        studentRepository.deleteById(id);
    } //delete student
    
    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    } //update Student
    
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }//get student by id
}
