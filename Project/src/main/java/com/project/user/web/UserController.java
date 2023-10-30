package com.project.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

	//main 페이지로 이동 
	@RequestMapping("main.do")
	public String main() {
		return "index";
	}
	
	@RequestMapping("login.do")
	public String userLogin() {
		return "user/login";
	}
	
	@RequestMapping("join.do")
	public String userJoin() {
		
	}
}
