package com.example.manytoone;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ManytooneApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(ManytooneApplication.class, args);
		CartRepository ct = context.getBean(CartRepository.class);
		ItemsRepository it = context.getBean(ItemsRepository.class);
		
		Cart c1= new Cart(1,"abc");
		ct.save(c1);
		Items i1=new Items(100,"Mouse",200,c1);
		it.save(i1);
		
	}

}
