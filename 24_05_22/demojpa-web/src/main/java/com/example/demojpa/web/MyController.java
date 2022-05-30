package com.example.demojpa.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController {
	@Autowired
	private UserRepository userrepo;
	@PostMapping("/createuser")
	public String CreateUser(@ModelAttribute Users users)
	{
		userrepo.save(users);
		return "index";
	}
	@GetMapping("/showall")
	public String show(Model model)
	{
		List<Users> ob=userrepo.findAll();
		model.addAttribute("users",ob);
		return "result";
	}
}
