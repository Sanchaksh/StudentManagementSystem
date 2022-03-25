/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.kaul.sanchaksh.service.ServiceImpl;

import com.kaul.sanchaksh.entity.Student;
import java.util.List;

/**
 *
 * @author sanch
 */
public interface StudentService {
    
    List<Student> getAllStudents();
    
    Student saveStudent(Student student);
    
    Student getStudentById(Long id);
    
    Student updateStudent(Student student);
    
    void deleteStudentById(Long id);
    
}
