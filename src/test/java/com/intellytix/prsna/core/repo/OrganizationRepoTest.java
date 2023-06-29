package com.intellytix.prsna.core.repo;

import static org.assertj.core.api.Assertions.assertThat;

import java.sql.Date;
import java.util.List;

import com.intellytix.prsna.core.entity.Organization;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class OrganizationRepoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private OrganizationRepo organizationRepo;

    @Test
    public void testFindByOrganizationName() {
        Organization organization = new Organization();
        organization.setId(1L);
        organization.setOrganizationName("LNCC");
        organization.setAddressLine1("123 Main St");
        organization.setAddressLine2("");
        organization.setState("GA");
        organization.setCountry("USA");
        organization.setZipCode("30004");
        organization.setCreateDate(new Date(2023/06/24));
        organization.setCreateUser("test");


        //entityManager.persist(organization);

        Organization organization1 = organizationRepo.save(organization);

        List<Organization> findByLastName = organizationRepo.findByOrganizationName(organization1.getOrganizationName());

        assertThat(findByLastName).extracting(Organization::getOrganizationName).containsOnly(organization1.getOrganizationName());
    }
}
