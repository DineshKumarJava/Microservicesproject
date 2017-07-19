package com.din.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.din.ecom.domain.User;
import com.din.ecom.service.UserService;

@RestController
public class UserController {
	@Value("${message}")
	private String message;

	@Autowired
	private UserService userservice;
	
	@Autowired
	MessageSource messagesource;

	@RequestMapping(value = "/addUser", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> addUser(@RequestBody User user) {		
		return new ResponseEntity<>(userservice.addUser(user), HttpStatus.OK);

	}

	@RequestMapping(value = "/getUser/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getUser(@PathVariable("userId") int userid) {
		System.out.println(messagesource.getMessage("label.title",null,null));
		return new ResponseEntity<>(userservice.getUserById(userid), HttpStatus.OK);
	}
	
	@RequestMapping(value = "/getallUser", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getallUser() {
		return new ResponseEntity<>(userservice.getUserAllUser(), HttpStatus.OK);
	}


}
