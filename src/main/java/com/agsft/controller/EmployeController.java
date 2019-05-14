package com.agsft.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agsft.model.Employee;

@RestController
public class EmployeController {
	
	
	@GetMapping(path="/")
	public void check()
	{
		new Employee();
	}

}
