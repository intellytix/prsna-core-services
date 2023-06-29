package com.intellytix.prsna.core.service;


import com.intellytix.prsna.core.entity.Organization;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrganizationServiceImplTest{

	@Autowired
	OrganizationService organizationService;

	@Test
	public void testGetOrganizationByName() {
		
		String name="LNCC";

		//OrganizationServiceImpl organizationService=new OrganizationServiceImpl();
		List<Organization> organization=organizationService.getOrganizationByName(name);

		assertNotNull(organization);
	}

}
