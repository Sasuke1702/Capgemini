package com.example.demoSpringBootApplication2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoSpringBootApplication2Application {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(DemoSpringBootApplication2Application.class, args);
		StudentDetails st;
		st=context.getBean(StudentDetails.class);
		st.setData();
		st.showData();
	}

}
