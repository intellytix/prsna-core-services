package com.intellytix.prsna.core.service;


import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.Organization;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MemberServiceImplTest {

	@Autowired
	MemberService memberService;

	@Test
	public void testGetMemberById() {

		List<Member> member=memberService.getMemberById(1L);

		assertNotNull(member);
	}

}
