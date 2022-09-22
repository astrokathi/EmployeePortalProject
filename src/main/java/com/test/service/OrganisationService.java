package com.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.model.Organisation;
import com.test.repository.OrganisationRepository;

@Service
public class OrganisationService {
	
	@Autowired
	OrganisationRepository orgRepository;

	public void saveAll(List<Organisation> org) {
		orgRepository.saveAll(org);
		
	}

	public List<Organisation> findAll() {
		return orgRepository.findAll();
	}

	public Organisation findById(int id) {
		Optional<Organisation> org =orgRepository.findById(id);
		return org.get();
	}

	public void deleteById(int id) {
		orgRepository.deleteById(id);
	}

	public void deleteAll() {
		orgRepository.deleteAll();
	}

	public String update(Organisation organisation, int id) {
		Optional<Organisation> org=orgRepository.findById(id);
		if (org==null) {
			return "No record found";
		}
		organisation.setId(id);
		orgRepository.save(organisation);
		return "Updated";
	}

	public void save(Organisation org) {
		orgRepository.save(org);
		
	}

	
	
	
	
	 

}
