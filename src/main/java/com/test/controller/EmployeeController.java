package com.test.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.service.EmployeeService;
import com.test.model.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/all")
	@RequestMapping(value = "/all",method = RequestMethod.GET)
	public List<Employee> getAllEmployee(){
		return employeeService.findAll();
		
	}
	

	@GetMapping("/all/{id}")
	@RequestMapping(value = "/all/{id}",method = RequestMethod.GET)
	public Optional<Employee> getEmployee(@PathVariable("employeeId") int employeeId) {
		return employeeService.findById(employeeId);
	}
	
	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public Object createEmployee(@RequestBody Employee org) {
		employeeService.save(org);
		return new HttpEntity<>("Success");
		

	}
	
	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	public void deleteEmployee(@PathVariable("employeeId") int employeeId) {
		employeeService.deleteById(employeeId);
	}
	
	@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
	public void deleteAllEmployee() {
		employeeService.deleteAll();
	}
	
	@RequestMapping(value = "/update/{id}",method = RequestMethod.PUT)
	public String updateEmployee(@RequestBody Employee organisation, @PathVariable("employeeId") int employeeId) {
		return employeeService.update(organisation,employeeId);
	}
	
	

}
