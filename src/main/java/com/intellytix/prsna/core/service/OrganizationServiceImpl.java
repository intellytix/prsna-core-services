package com.intellytix.prsna.core.service;

import java.util.List;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.repo.OrganizationRepo;
import com.intellytix.prsna.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellytix.prsna.core.entity.Organization;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private OrganizationRepo organizationRepo;
	
	@Override
	public List<Organization> getOrganizationByName(String name) {
		
		List<Organization> organization = organizationRepo.findByOrganizationName(name);

		if (organization == null || organization.isEmpty()) {
			throw new EntityNotFoundException(Organization.class, "name", name);
		}
		
		return organization;
	}

}
