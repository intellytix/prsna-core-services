package com.intellytix.prsna.core.rest;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.MemberAuth;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MemberAuthControllerTest {

	@Autowired
	MemberAuthController memberAuthController;

	@Test
	public void testGetMemberAuthById() {

		List<MemberAuth> memberAuth = memberAuthController.getMemberAuthById("1");

		assertNotNull(memberAuth);
	}
}
