package com.codixlabs.di.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping
	String helloWorld() {
		return "Hello World";
	}

	@GetMapping("print/{first_name}")
	String helloWorldWithPathVariables(@PathVariable(name = "first_name") String firstName) {
		System.out.println(firstName);
		return "Hello " + firstName;
	}

	@GetMapping("print2")
	String helloWorldWithQueryParams(@RequestParam(name = "first_name") String firstName) {
		System.out.println(firstName);
		return "Hello " + firstName;
	}

	@PostMapping(path = "post")
	void printMyStatement(@RequestBody String name) {
		System.out.println(name);
	}

}
