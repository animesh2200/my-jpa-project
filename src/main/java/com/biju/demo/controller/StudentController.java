package com.biju.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.biju.demo.entity.Student;
import com.biju.demo.service.StudentService;

@RestController
public class StudentController {
@Autowired
StudentService studentService;

@GetMapping (value="/student")
public Student getStudent(@RequestParam int roll) {
	return studentService.student(roll);
	
}
@RequestMapping(value = "/saveStudent", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
public String saveStudent(@RequestBody Student student) {
	return studentService.saveStudent(student);
}

@RequestMapping(value = "/deleteStudent", method=RequestMethod.DELETE)
public void deleteStudent(@RequestParam("roll") int roll) {		
	 studentService.deleteOrderById(roll);
}
}
