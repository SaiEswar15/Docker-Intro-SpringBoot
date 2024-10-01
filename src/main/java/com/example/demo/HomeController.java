package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@Autowired
	private StudentRepository studentRepo;

	@GetMapping(value = "/")
	public String homepage()
	{
		return "welcome to homepage";
	}
	
	@GetMapping(value = "/getAllStudents")
	public List<Student> getAllStudents()
	{
		return studentRepo.findAll();
	}
	
	@GetMapping(value = "/addStudent")
	public Student addStudent(@RequestParam int rollno,@RequestParam String name,@RequestParam int marks)
	{
		Student stud = new Student();
		stud.setRollno(rollno);
		stud.setName(name);
		stud.setMarks(marks);
		return studentRepo.save(stud);
	}
	
	@GetMapping(value = "/logout")
	public String logout()
	{
		return "Logout";
	}
}
