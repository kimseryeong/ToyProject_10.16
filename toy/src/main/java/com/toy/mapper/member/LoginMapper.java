package com.toy.mapper.member;

import org.apache.ibatis.annotations.Mapper;

import com.toy.domain.member.LoginVO;

@Mapper
public interface LoginMapper {

	public LoginVO selectUserLogin(String id, String pw);
}
