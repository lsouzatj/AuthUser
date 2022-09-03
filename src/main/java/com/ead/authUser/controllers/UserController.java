package com.ead.authUser.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ead.authUser.services.UserService;

@RestController
@RequestMapping("users")
public final class UserController {

	@Autowired
	UserService userService;
	
	@GetMapping("allUsers")
	public ResponseEntity<Object> getAllUser(){
		
		var listUserModel = userService.findAll();
		
		if (listUserModel.get().isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("List users not found");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(listUserModel);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<Object> getOneUser(@PathVariable(value = "userId") UUID userId){
		
		var userModel = userService.findById(userId);
		
		if (userModel.isEmpty()) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(userModel);
	}

}
