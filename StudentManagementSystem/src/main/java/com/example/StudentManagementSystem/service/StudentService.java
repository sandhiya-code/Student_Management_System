package com.example.StudentManagementSystem.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.StudentManagementSystem.entity.Student;
import com.example.StudentManagementSystem.repository.StudentRepository;

@Service
public class StudentService {
	
	private StudentRepository studentRepository;
	
	// create constructor
	
	public StudentService(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}
	
	// get all student list	
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
		
	}

	// save the student details	
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	//get the details from the database an edit the student details 
	public Student getStudentById(Long id) {
		return studentRepository.findById(id).get();
	}
	
	//update the details and save the student records
	public Student updateStudent(Student student) {
		return studentRepository.save(student);
	}
	
	// delete the student details	
	public void deleteStudentById(Long id) {
		studentRepository.deleteById(id);	
	}

}
