package com.nlu.trella.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nlu.trella.dao.UserEntityRepository;
import com.nlu.trella.model.UserEntity;

@RestController
public class UserController {

	@Autowired
	private UserEntityRepository userRepository;

	@GetMapping(value = "/users")
	public ResponseEntity<?> getUsers() {
//		UserEntity user = new UserEntity();
//		user.setId(1l);
//		user.setName("DAt");
		return ResponseEntity.ok(userRepository.findAll());
	}

	@PostMapping(value = "/users")
	public ResponseEntity<?> saveUsers(@RequestBody UserEntity user) {
		return ResponseEntity.ok(userRepository.save(user));
	}

}
