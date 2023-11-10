package com.analyzer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.analyzer.dto.SignUpRequestDto;
import com.analyzer.repository.MoUserRepository;
import com.analyzer.dto.UserDto;
import com.analyzer.model.MoUser;

public class AuthService {

	@Autowired
	private MoUserRepository userRepo;

	public UserDto createUser(SignUpRequestDto req) {
		
		MoUser moUser = new MoUser();
		
		moUser.setEmail(req.getEmail());
		moUser.setUserName(req.getUserName());
		moUser.setPassword(new BCryptPasswordEncoder().encode(req.getPassword()));
		userRepo.save(moUser);
		
		UserDto userDto = new UserDto();
		userDto.setEmail(moUser.getEmail());
		userDto.setUserName(moUser.getUserName());
		return userDto;
	}
	
}
