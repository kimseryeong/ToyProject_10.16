package com.toy.dao.member;

import org.springframework.stereotype.Repository;

import com.toy.domain.member.LoginVO;
import com.toy.mapper.member.LoginMapper;

@Repository
public class LoginDAO {

	private LoginMapper loginMapper;
	
	public LoginDAO(LoginMapper loginMapper) {
		this.loginMapper = loginMapper;
	}
	
	public LoginVO selectUserLogin(String id, String pw) {
		return loginMapper.selectUserLogin(id, pw);
	}
}
