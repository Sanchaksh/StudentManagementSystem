/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.kaul.sanchaksh.repository;

import com.kaul.sanchaksh.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sanch
 */
public interface StudentRepository extends JpaRepository<Student, Long>{
    
}
