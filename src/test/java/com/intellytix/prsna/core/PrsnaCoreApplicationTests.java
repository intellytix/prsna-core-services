package com.intellytix.prsna.core;

import com.intellytix.prsna.core.rest.OrganizationController;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;

@SpringBootTest
class PrsnaCoreApplicationTests {

	@Autowired
	private OrganizationController organizationController;

	@Test
	void contextLoads() {
		assertThat(organizationController).isNotNull();
	}

}
