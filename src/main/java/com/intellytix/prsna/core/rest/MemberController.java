package com.intellytix.prsna.core.rest;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.Organization;
import com.intellytix.prsna.core.repo.MemberRepo;
import com.intellytix.prsna.core.repo.OrganizationRepo;
import com.intellytix.prsna.core.service.MemberService;
import com.intellytix.prsna.core.service.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MemberController {

	@Autowired
	private MemberService memberService;

	@Autowired
	private MemberRepo memberRepo;

	
	@GetMapping("/member/id={id}")
	public List<Member> getMemberById(@PathVariable("id") Long id) {
		List<Member> member = memberService.getMemberById(id);
		return member;
		
	}

	@PostMapping("/member")
	public ResponseEntity<Member> createMember(@RequestBody Member member) {
		try {
			Member member1 = memberRepo
					.save(new Member(member.getId(),member.getOrganizationId(), member.getLegalName(), member.getSpiritualName(), member.getEmail(), member.getPhoneNumber(), member.getDateOfBirth(), member.getAddressLine1(), member.getAddressLine2()
					,member.getState(), member.getCountry(),member.getZipCode(), member.getUserType(), member.getRegisteredMemberId(), member.getLastLoginDate(),member.getCreateDate(), member.getUpdateDate(), member.getCreateUser(), member.getUpdateUser()));
			return new ResponseEntity<>(member1, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
