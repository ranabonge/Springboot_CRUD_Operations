package com.example.demo.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;


@Repository
public interface StudentRepository extends JpaRepository<Student, Serializable>{
	
	
    @Query(value="select * from Student_Springboot where name=?", nativeQuery=true)
	public List<Student> getStudentByName(String name);
    
    @Query(value="select * from Student_Springboot where city=?", nativeQuery=true)
	public List<Student> getStudentByCity(String city);
    
}
