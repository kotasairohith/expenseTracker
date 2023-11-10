package com.analyzer.dto;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

	@Id
	private String id;
	
	private String email;
	
	private String userName;
	
	private String password;
	
	private String 	profileImage;

}
