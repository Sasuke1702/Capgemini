package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {

		ApplicationContext context;
		context=SpringApplication.run(DemoApplication.class, args);

		StudentRepository stud= context.getBean(StudentRepository.class);

		//insert
		Student st=new Student(3,"abc");
		stud.save(st);
		System.out.println("Record saved");

		//update

		Student st1=new Student(1,"test");
		stud.delete(st1);
		System.out.println("Record saved");
	}

}
