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
		List<Organization> organization = organizationService.getOrganizationByName(name);
		return organization;
		
	}

	@PostMapping("/organization")
	public ResponseEntity<Organization> createOrganization(@RequestBody Organization organization) {
		try {
			Organization organization1 = organizationRepo
					.save(new Organization(organization.getId(),organization.getOrganizationName(), organization.getAddressLine1(), organization.getAddressLine2()
					,organization.getState(), organization.getCountry(),organization.getZipCode(), organization.getCreateDate(), organization.getCreateUser(), organization.getUpdateDate(), organization.getUpdateUser()));
			return new ResponseEntity<>(organization1, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
