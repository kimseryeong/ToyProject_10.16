package com.toy.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.toy.dao.member.LoginDAO;
import com.toy.domain.member.LoginVO;

import ch.qos.logback.classic.Logger;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class LoginController {

	private LoginDAO loginDAO;
	
	/**
	 * 로그인 페이지 이동 
	 * @return
	 * @throws Exception
	 */
	@GetMapping("/login")
	public String goLoginPage() throws Exception{
		
		return "login";
	}
	
	
	@PostMapping("/login.do")
	public String login(HttpServletRequest reqs) throws Exception{
		String id = reqs.getParameter("id");
		String pw = reqs.getParameter("pw");
		
		LoginVO res = loginDAO.selectUserLogin(id, pw);
		
		
		String result = "성공 ";
		
		
		
		
		
		return result;
	}
}
