package com.intellytix.prsna.core.rest;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.Organization;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class MemberControllerTest {

	@Autowired
	MemberController memberController;

	@Test
	public void testGetMemberById() {

		List<Member> member=memberController.getMemberById(1L);

		assertNotNull(member);
	}
}
