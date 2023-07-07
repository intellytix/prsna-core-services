package com.intellytix.prsna.core.service;

import java.util.List;
import java.util.Set;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.repo.OrganizationRepo;
import com.intellytix.prsna.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellytix.prsna.core.entity.Organization;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;

@Service
public class OrganizationServiceImpl implements OrganizationService {

	@Autowired
	private Validator validator;

	@Autowired
	private OrganizationRepo organizationRepo;
	
	@Override
	public List<Organization> getOrganizationByName(String name, Boolean apiCheck) {
		
		List<Organization> organization = organizationRepo.findByOrganizationName(name);

		if (apiCheck && (organization == null || organization.isEmpty())) {
			throw new EntityNotFoundException(Organization.class, "name", name);
		}
		
		return organization;
	}

	@Override
	public Organization addOrUpdateOrganization(Organization organization) {

		Set<ConstraintViolation<Organization>> violations = validator.validate(organization);

		if (!violations.isEmpty()) {
			StringBuilder sb = new StringBuilder();
			for (ConstraintViolation<Organization> constraintViolation : violations) {
				sb.append(constraintViolation.getMessage());
			}

			throw new ConstraintViolationException("Error occurred: " + sb.toString(), violations);
		}

		Organization organization1 = organizationRepo
				.save(new Organization(organization.getId(),organization.getOrganizationName(), organization.getAddressLine1(), organization.getAddressLine2()
						,organization.getState(), organization.getCountry(),organization.getZipCode(), organization.getCreateDate(), organization.getCreateUser(), organization.getUpdateDate(), organization.getUpdateUser()));

		return organization1;
	}

}
