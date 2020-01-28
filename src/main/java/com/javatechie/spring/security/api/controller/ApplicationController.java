package com.javatechie.spring.security.api.controller;

import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class ApplicationController {

	@PreAuthorize("hasAnyRole('USER','ADMIN')")
	@GetMapping("/getMsg")
	public String greeting() {
		return "spring security example";
	}

	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/getPreMsg")
	public String greet() {
		return " pre authorize spring security example";
	}

}
