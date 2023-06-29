package com.intellytix.prsna.core.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intellytix.prsna.core.entity.Organization;
@Service
public interface OrganizationService {
	
	public List<Organization> getOrganizationByName(String name);

}
