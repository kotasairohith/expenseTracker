package com.analyzer.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.analyzer.dto.AuthenticationResponseDto;
import com.analyzer.dto.LoginRequest;
import com.analyzer.dto.SignUpRequestDto;
import com.analyzer.dto.UserDto;
import com.analyzer.service.AuthService;
import com.analyzer.service.JwtService;
import com.analyzer.service.UserService;

import io.jsonwebtoken.io.IOException;
import jakarta.servlet.http.HttpServletResponse;

public class UserRestController {

	@Autowired
	private JwtService jwtService;
	
	@Autowired
	private AuthService authService;
	
	@Autowired
	private AuthenticationManager authManager;
	
	@Autowired
	private UserService userService;
	
	@PostMapping("/signup")
	public ResponseEntity<?> createUser(@RequestBody SignUpRequestDto req){
		UserDto newUser = authService.createUser(req);
		
		if(newUser == null) {
			return new ResponseEntity<>("User not created try again later",HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>("User created",HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public AuthenticationResponseDto login(@RequestBody LoginRequest request, HttpServletResponse response) throws BadCredentialsException, DisabledException, UsernameNotFoundException, IOException {
		 try {
	            authManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUserName(), request.getPassword()));
	        } catch (BadCredentialsException e) {
	            throw new BadCredentialsException("Incorrect username or password!");
	        }
		final UserDetails userDetails  = userService.loadUserByUsername(request.getUserName());
		
		final String jwt = jwtService.generateToken(userDetails.getUsername());
		
		return new AuthenticationResponseDto(jwt);
		
	}
}
