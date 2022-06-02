package com.example.Assigmenthttpmethod;

import javax.persistence.Entity;


import org.springframework.data.annotation.Id;

@Entity
public class Employee {
	@Id
	private int emp_id;
	private String name;
	private String address;
	private String email;
	private int phoneNo;
	private int salary;
	
	public Employee()
	{
		
	}
	public Employee(int emp_id, String name ,String address, String phone, int phoneNo, int salary)
	{
		super();
		this.emp_id=emp_id;
		this.name=name;
		this.address=address;
		this.phoneNo=phoneNo;
		this.salary=salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
}
