package com.intellytix.prsna.core.rest;

import java.util.List;

import com.intellytix.prsna.core.repo.OrganizationRepo;
import com.intellytix.prsna.core.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.intellytix.prsna.core.entity.Organization;

@RestController
public class OrganizationController {

	@Autowired
	private OrganizationService organizationService;

	@Autowired
	private OrganizationRepo organizationRepo;
	
	@GetMapping("/hello")	
	public String getHelloString() {
		return "Hello";
	}
	
	//@GetMapping("/getOrganization?name={name}")
	//@RequestMapping(value="/organization?name={name}", method=RequestMethod.GET)
	@GetMapping("/organization/name={name}")
	public List<Organization> getOrganizationDetailsByName(@PathVariable("name") String name) {
		List<Organization> organization = organizationService.getOrganizationByName(name, true);
		return organization;
		
	}

	@PostMapping("/organization")
	public ResponseEntity<Object> createOrganization(@RequestBody Organization organization) {

		  List<Organization> organization1 = organizationService.getOrganizationByName(organization.getOrganizationName(), false);

		  if(organization1 != null && !organization1.isEmpty()){
			  organization.setId(organization1.get(0).getId());
		  }

		  Organization organization2 = organizationService.addOrUpdateOrganization(organization);

		  return new ResponseEntity<>(organization2, HttpStatus.CREATED);

	}

}
