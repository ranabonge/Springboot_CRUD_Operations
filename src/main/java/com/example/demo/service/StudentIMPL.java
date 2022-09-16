package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.StudentRepository;
import com.example.demo.model.Student;


@Service
public class StudentIMPL implements StudentService{
	
	

	@Autowired
	private  StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		
		return studentRepository.save(student);
	}

	@Override
	public Optional<Student> getStudent(int id) {
		
		Optional<Student> student=studentRepository.findById(id);
		return student;
	
	}
	
	@Override
	public Student deleteStudent(int id) {
		studentRepository.deleteById(id);
		return null;
	}
	
	@Override
	public List<Student> getStudentByName(String name) {
	
			List<Student> list=studentRepository.getStudentByName(name);
			
			return list;
	}
	
	
	@Override
	public List<Student> getStudentByCity(String city) {
		List<Student> list=studentRepository.getStudentByCity(city);
		return list;
	}

}
