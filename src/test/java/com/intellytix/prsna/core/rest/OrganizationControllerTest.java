package com.intellytix.prsna.core.rest;

import com.intellytix.prsna.core.entity.Organization;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class OrganizationControllerTest {

	@Autowired
	OrganizationController organizationController;

	@Test
	public void testGetOrganizationDetailsByName() {

		String name="LNCC";

		List<Organization> organization=organizationController.getOrganizationDetailsByName(name);

		assertNotNull(organization);
	}
}
