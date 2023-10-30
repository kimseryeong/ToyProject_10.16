package com.project.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserVO {

	private String id;
	private String pw;
	private String name;
	private String address;
	private String phone;
	private String created_date;
	private String updated_date;
}
