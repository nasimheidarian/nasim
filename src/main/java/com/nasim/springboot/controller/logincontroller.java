package com.nasim.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class logincontroller {
	
	@Controller
	public class LoginController {

	    @RequestMapping(value = "/login")
	    @ResponseBody
	    public String sayHello() {
	        return "Hello World dummy";
	    }

	}

}
