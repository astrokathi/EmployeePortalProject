package com.test.controller;

import java.net.URI;
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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.test.model.Employee;
import com.test.model.Organisation;
import com.test.service.OrganisationService;

@RestController
@RequestMapping("/organisation")
public class OrganisationController {

	@Autowired
	OrganisationService orgService;

	@RequestMapping(value = "/all",method = RequestMethod.GET)
	public List<Organisation> getAllEmployee() {
		return orgService.findAll();

	}

	@RequestMapping(value = "/all/{id}",method = RequestMethod.GET)
	private Organisation getBooks(@PathVariable("id") int id) {
		return orgService.findById(id);
	}

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public Object createStudent(@RequestBody Organisation org) {
		orgService.save(org);
		return org;

	}

	@RequestMapping(value = "/update",method = RequestMethod.PUT)
	private Organisation update(@RequestBody Organisation org) {
		orgService.save(org);
		return org;
	}

	@RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
	public void deleteOrganisation(@PathVariable("id") int id) {
		orgService.deleteById(id);
	}

	@RequestMapping(value = "/delete",method = RequestMethod.DELETE)
	public void deleteAllOrganisation() {
		orgService.deleteAll();
	}

}
