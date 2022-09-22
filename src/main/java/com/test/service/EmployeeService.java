package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Employee;
import com.test.model.Organisation;
import com.test.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	public Optional<Employee> findById(int id) {
		return employeeRepository.findById(id);
	}

	public void save(Employee org) {
		employeeRepository.save(org);
		
	}

	public void deleteById(int id) {
		employeeRepository.deleteById(id);
		
	}

	public void deleteAll() {
		employeeRepository.deleteAll();
	}

	public String update(Employee emp, int id) {
		Optional<Employee> org=employeeRepository.findById(id);
		if (org==null) {
			return "No record found";
		}
		emp.setEmployeeId(id);
		employeeRepository.save(emp);
		return "Updated";
	}

}
