package com.intellytix.prsna.core.rest;

import com.intellytix.prsna.core.entity.MemberAuth;
import com.intellytix.prsna.core.entity.Organization;
import com.intellytix.prsna.core.repo.MemberAuthRepo;
import com.intellytix.prsna.core.repo.OrganizationRepo;
import com.intellytix.prsna.core.service.MemberAuthService;
import com.intellytix.prsna.core.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberAuthController {

	@Autowired
	private MemberAuthService memberAuthService;

	@Autowired
	private MemberAuthRepo memberAuthRepo;

	
	@GetMapping("/memberProfile&externalMemberId={id}")
	public List<MemberAuth> getMemberAuthById(@PathVariable("id") String id) {
		List<MemberAuth> memberAuths = memberAuthService.getMemberAuthByMemberId(id);
		return memberAuths;
		
	}

	@PostMapping("/memberProfile")
	public ResponseEntity<MemberAuth> createMemberAuth(@RequestBody MemberAuth memberAuth) {
		try {
			MemberAuth memberAuth1 = memberAuthRepo
					.save(new MemberAuth(memberAuth.getId(),memberAuth.getMemberId(), memberAuth.getAuthToken(), memberAuth.getUserName()
					,memberAuth.getPassword(), memberAuth.getCreateDate(), memberAuth.getUpdateDate(), memberAuth.getCreateUser(), memberAuth.getUpdateUser()));
			return new ResponseEntity<>(memberAuth1, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
