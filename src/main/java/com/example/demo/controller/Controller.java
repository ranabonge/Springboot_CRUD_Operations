package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;


@RestController
@RequestMapping("/Student_Springboot")
public class Controller {
	private static final Logger logger=LoggerFactory.getLogger(Controller.class);

	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/save")
	public ResponseEntity<Student> saveStudent(@RequestBody Student student){
		logger.info("Testing save method");
		Student stu=studentservice.saveStudent(student);
		return ResponseEntity.ok().body(stu);
		}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Optional<Student>> getStudent(@PathVariable("id")  int id) throws Exception{
		Optional<Student> stud1=studentservice.getStudent(id);
		return ResponseEntity.ok().body(stud1);
	}
		
	@DeleteMapping("delete/{id}")
	public Student deleteStudent(@PathVariable("id")  int id) throws Exception{
		studentservice.deleteStudent(id);
		return null;
	}
	
	@GetMapping("/name/{name}")
	public ResponseEntity<List<Student>> getStudentByName(@PathVariable("name") String name) throws Exception {
		List<Student> l2=studentservice.getStudentByName(name);
		return ResponseEntity.ok().body(l2);
	}
	
	@GetMapping("/city/{city}")
	public ResponseEntity<List<Student>> getStudentByCity(@PathVariable("city") String city) throws Exception {
		List<Student> l3=studentservice.getStudentByCity(city);
		return ResponseEntity.ok().body(l3);
	}
	
	
	
}
