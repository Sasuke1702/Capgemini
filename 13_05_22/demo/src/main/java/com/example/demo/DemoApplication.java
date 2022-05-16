package com.example.demo;

import org.springframework.boot.SpringApplication;
import java.util.Optional;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		StudentRepository stud=context.getBean(StudentRepository.class);
		//insert
		
		Student st1=new Student(300,"cccc");
		stud.save(st1);
		System.out.println("Record Saved");
		
		//update
		
		Optional<Student> op;
	
		op=stud.findById(300);
	Student st2=op.get();
	System.out.println(st2.getId());
		System.out.println(st2.getName());
		st2.setName("demo123");
		stud.save(st2);
//delete
		
		Optional<Student> op1;		
		op1=stud.findById(300);
		Student st3=op1.get();
		stud.delete(st3);
		
	
	}

}
