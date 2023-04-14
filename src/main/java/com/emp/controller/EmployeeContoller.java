package com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.service.EmployeeService;


@RestController
@RequestMapping("/emp-home")
public class EmployeeContoller {
	
	@Autowired
	EmployeeService service;
	
	@PostMapping("/insert")
	public Employee insertEmployee(@RequestBody Employee emp) {
		return service.insertEmployee(emp);
	}
	
	@GetMapping("/fetch/{id}")
	public Employee fetchEmployee(@PathVariable int id) {
	return service.findById(id);
	}
	
	@DeleteMapping("/remove/{id}")
	public void removeEmployee(@PathVariable int id) {
		service.removeEmployee(id);
	}
	
	@PutMapping("/edit/{id}")
	public Employee editEmployee(@PathVariable int id, @RequestBody Employee emp) {
	return service.editEmployee(id, emp);	
	}
	

}
