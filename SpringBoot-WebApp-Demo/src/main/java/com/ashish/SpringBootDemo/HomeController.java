package com.ashish.SpringBootDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String home()
	{		
		//return "index.jsp";
		System.out.println("Inside HomeController");
		return "login.html";  // Commenting to test suffix configured in application.properties file
		//return "login";
	}

}
