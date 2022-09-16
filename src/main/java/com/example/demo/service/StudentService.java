package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Student;

public interface StudentService {
	
	public Student saveStudent(Student student);
	
	public Optional<Student> getStudent(int id);
	
	public Student deleteStudent(int id);
	
	public List<Student> getStudentByName(String name);
	
	public List<Student> getStudentByCity(String city);
	
	
	

}
