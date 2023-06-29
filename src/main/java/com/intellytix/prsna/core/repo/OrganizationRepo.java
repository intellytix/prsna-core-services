package com.intellytix.prsna.core.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.intellytix.prsna.core.entity.Organization;

@Repository
public interface OrganizationRepo extends JpaRepository<Organization, String>{

	public Organization save(Organization organization);

	@Query(nativeQuery = true , value = "select * from prsna.organization where organization_name = :name")
	public List<Organization> findByOrganizationName(@Param("name") String organizationName);
	
}


