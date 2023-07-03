package com.intellytix.prsna.core.repo;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.MemberAuth;
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
public class MemberAuthRepoTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private MemberAuthRepo memberAuthRepo;

    @Test
    public void testFindByMemberAuthId() {
        MemberAuth memberAuth = new MemberAuth();
        memberAuth.setId(1L);
        memberAuth.setMemberId(1L);
        memberAuth.setAuthToken("abcdef");
        memberAuth.setUserName("krishna123");
        memberAuth.setPassword("Welcome123!");
        memberAuth.setCreateDate(new Date(2023/06/24));
        memberAuth.setCreateUser("test");


        //entityManager.persist(organization);

        MemberAuth memberAuth1 = memberAuthRepo.save(memberAuth);

        List<MemberAuth> memberAuthList = memberAuthRepo.findByMemberId(memberAuth1.getId().toString());

        assertThat(memberAuthList).extracting(MemberAuth::getId).containsOnly(memberAuth1.getId());
    }
}
