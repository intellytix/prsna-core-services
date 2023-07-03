package com.intellytix.prsna.core.service;


import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.MemberAuth;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MemberAuthServiceImplTest {

	@Autowired
	MemberAuthService memberAuthService;

	@Test
	public void testGetMemberById() {

		List<MemberAuth> memberAuth = memberAuthService.getMemberAuthById("1");

		assertNotNull(memberAuth);
	}

}
