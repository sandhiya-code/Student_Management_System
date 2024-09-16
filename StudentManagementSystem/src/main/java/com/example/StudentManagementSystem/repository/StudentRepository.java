package com.example.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentManagementSystem.entity.Student;

//Student - entity class name 
//long - datatype of id column .

public interface StudentRepository extends JpaRepository<Student, Long>{

}
