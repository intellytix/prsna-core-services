package com.intellytix.prsna.core.service;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.Organization;
import com.intellytix.prsna.core.repo.MemberRepo;
import com.intellytix.prsna.core.repo.OrganizationRepo;
import com.intellytix.prsna.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepo memberRepo;
	
	@Override
	public List<Member> getMemberById(Long id) {
		
		List<Member> member = memberRepo.findByMemberId(id);

		if (member == null || member.isEmpty()) {
			throw new EntityNotFoundException(Member.class, "id", id.toString());
		}
		
		return member;
	}

}
