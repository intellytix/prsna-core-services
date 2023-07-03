package com.intellytix.prsna.core.repo;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.Organization;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.sql.Date;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class MemberRepoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private MemberRepo memberRepo;

    @Test
    public void testFindByMemberId() {
        Member member = new Member();
        member.setOrganizationId(1L);
        member.setLegalName("RK Nalakurthi");
        member.setSpiritualName("RKSD");
        member.setDateOfBirth(new Date(2003/06/01));
        member.setLastLoginDate(new Date(2023/06/24));
        member.setEmail("rnalakurthi@gmail.com");
        member.setPhoneNumber("7702655803");
        member.setAddressLine1("123 Main St");
        member.setAddressLine2("");
        member.setState("GA");
        member.setCountry("USA");
        member.setZipCode("30004");
        member.setUserType("admin");
        member.setRegisteredMemberId(1L);
        member.setCreateDate(new Date(2023/06/24));
        member.setCreateUser("test");


        //entityManager.persist(organization);

        Member member1 = memberRepo.save(member);

        List<Member> members = memberRepo.findByMemberId(member1.getId());

        assertThat(members).extracting(Member::getId).containsOnly(member1.getId());
    }
}
