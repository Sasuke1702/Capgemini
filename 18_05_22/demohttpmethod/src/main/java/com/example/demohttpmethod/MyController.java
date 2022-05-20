package com.example.demohttpmethod;

import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

@RestController
public class MyController {
	@Autowired
	private StudentRepository stud;
	
	@GetMapping("/Students")
	public java.util.List<Student> getAllStudents()
	{
		return stud.findAll();	}


	@GetMapping("/Student/{id}")
	public Student getStudentById(@PathVariable("id")Integer studId)
	{
		java.util.Optional <Student> op=stud.findById(studId);
		Student st=op.get();
		return st;
	}
	
	@PostMapping("/save")
	public Student createStudent (@RequestBody Student st)
	{
		return stud.save(st);
	}
	
	@PutMapping("/updatestud/{id}")
	public boolean updateStudent (@PathVariable(value="id")Integer studId, @RequestBody Student studDetails)throws Exception
	{
		 boolean f=true;
		 try
		 {
			 java.util.Optional<Student> op =stud.findById(studId);
			 Student st=op.get();
			 st.setName(studDetails.getName());
			 final Student updatedStud=stud.save(st);
		 }catch (Exception e)
		 {
			 f=false;
		 }
		return f;
	}
	
	@DeleteMapping("/deletestud/{id}")
	public boolean deleteStudent(@PathVariable(value="id")Integer studId, @RequestBody Student studDetails)throws Exception
	{
		java.util.Optional<Student> op=stud.findById(studId);
		Student st =op.get();
		stud.delete(st);
		return true;
	}
}
