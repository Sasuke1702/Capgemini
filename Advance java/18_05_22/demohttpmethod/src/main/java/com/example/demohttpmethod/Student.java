package com.example.demohttpmethod;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
    private int id;

    @Column(name = "name")
    private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	Student()
    {

    }

    Student(int id , String name)
    {
    	super();
      this.id=id;
      this.name=name;

    }
    
	

}
