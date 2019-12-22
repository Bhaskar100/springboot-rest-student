package com.springbooot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbooot.model.Student;
import com.springbooot.service.StudentRepository;

@RestController
@CrossOrigin(maxAge=3600)
@RequestMapping("/students")
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

	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student student) {

		return studentRepository.save(student);
	}

	@DeleteMapping("/deleteStudent")
	public void deleteStudent(Integer id) {

		studentRepository.deleteById(id);
	}
	
	@GetMapping("/allStudents")
	public List<Student> getStudents(){
		
		return studentRepository.findAll();
	}

}
