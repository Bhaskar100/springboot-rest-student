package com.springbooot.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbooot.model.Student;
import com.springbooot.service.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@PostMapping("/saveStudent")
	public Student saveStudent(@RequestBody Student student) {
		
		return studentRepository.save(student);
	}
	
	@GetMapping("/getStudent")
	public Student getStudent(int id) {
		
		return studentRepository.getOne(id);
	}

}
