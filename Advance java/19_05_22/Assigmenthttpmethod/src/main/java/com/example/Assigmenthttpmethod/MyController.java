package com.example.Assigmenthttpmethod;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@Autowired
	private EmployeeRepository employee;
	
	@PostMapping("/save")
	public Employee createEmployee(@RequestBody Employee emp)
	{
		return employee.save(emp);
	}
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable("id")Integer empid)
	{
		Optional<Employee> op = employee.findById(empid);
		Employee emp=op.get();
		return emp;
	}
	@PostMapping("/update/{id}")
	public boolean updateEmployee(@PathVariable(value="id")Integer empId, @RequestBody Employee empDetails)
	{
		boolean f=true;
		try
		{
			Optional<Employee>op = employee.findById(empId);
			Employee emp=op.get();
			emp.setName(empDetails.getName());
			emp.setAddress(empDetails.getAddress());
			emp.setEmail(empDetails.getEmail());
			emp.setPhoneNo(empDetails.getPhoneNo());
			emp.setSalary(empDetails.getSalary());
			
			
		}catch (Exception e) {
			f=false;
		}return f;
	}
	
	@DeleteMapping("/delete/{id}")
	public boolean deleteEmployee(@PathVariable(value="id")Integer empId, @RequestBody Employee empDetails)
	{
		boolean f=true;
		try {
			Optional<Employee>op= employee.findById(empId);
			Employee emp=op.get();
			employee.delete(emp);
			
		}catch (Exception e)
		{
			f=false;
		}return f;
	}
	
}
