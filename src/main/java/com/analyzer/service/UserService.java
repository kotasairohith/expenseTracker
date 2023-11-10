package com.analyzer.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.analyzer.model.MoUser;
import com.analyzer.repository.MoUserRepository;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private MoUserRepository userRepo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		MoUser moUser = userRepo.findByUserName();
		
		if(moUser == null) {
			throw new UsernameNotFoundException("User not found");
		}
		return new org.springframework.security.core.userdetails.User(moUser.getEmail(), moUser.getPassword(), new ArrayList<>());
	}

}
