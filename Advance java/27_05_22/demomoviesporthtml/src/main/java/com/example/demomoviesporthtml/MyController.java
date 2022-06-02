package com.example.demomoviesporthtml;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@GetMapping("/")
	public String indexPage()
	{
	
			return "index";
	}
	@GetMapping("/main")
	public String mainPage(@RequestParam String uname, HttpSession session)
	{
		//model.addAttribute("fname", uname);
		session.setAttribute("fname", uname);
		return "main";
	}
	@GetMapping("/movie")
	public String moviePage(HttpSession session, Model model)
	{
		model.addAttribute("fname", session.getAttribute("fname"));
		String n=(String)session.getAttribute("fname");
		System.out.println("Name of User : "+n);
		return "movie";
	}
	@GetMapping("/sport")
	public String SportPage()
	{
		
		return "sport";
	}
}
