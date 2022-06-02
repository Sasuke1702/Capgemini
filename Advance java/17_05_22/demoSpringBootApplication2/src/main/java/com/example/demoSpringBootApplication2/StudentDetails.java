package com.example.demoSpringBootApplication2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StudentDetails {
	
	private Student stud;
	@Autowired
	public StudentDetails(Student stud)
	{
		this.stud=stud;
	}
	void setData()
	{
		stud.setId(100);
		stud.setName("rushi");
	}
	void showData()
	{
		System.out.println(stud.getId());
		System.out.println(stud.getName());
	}

}
/*@Controller
public class StudentDetails {

	private Student stud;
	
	 
	public Student getStud() {
		return stud;
	}
	@Autowired
	public void setStud(Student stud) {
		this.stud = stud;
	}
	void setData() {
		stud.setId(800);
		stud.setName("Rush");
	}
	void showData() {
		System.out.println(stud.getId());
		System.out.println(stud.getName());
	}
}
*/
