package com.joysite.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.joysite.backend.service.UsrService;
import com.joysite.backend.dto.UsrDto;

@RestController
public class UsrController {
	
	private UsrService usrService;
	
	public UsrController(UsrService usrService) {
		this.usrService = usrService;
	}

	@PostMapping
	public UsrDto registerUser(@RequestBody UsrDto usrDto) {
		return usrService.registerUser(usrDto);
	}

	@GetMapping("/{usrId}")
	public UsrDto getUserByEmail(@PathVariable String email) {
		return usrService.getUserByEmail(email);
	}
}
