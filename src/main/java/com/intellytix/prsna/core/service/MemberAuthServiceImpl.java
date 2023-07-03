package com.intellytix.prsna.core.service;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.MemberAuth;
import com.intellytix.prsna.core.repo.MemberAuthRepo;
import com.intellytix.prsna.core.repo.MemberRepo;
import com.intellytix.prsna.exception.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberAuthServiceImpl implements MemberAuthService {

	@Autowired
	private MemberAuthRepo memberAuthRepo;

	@Override
	public List<MemberAuth> getMemberAuthById(String id) {
		List<MemberAuth> memberAuth = memberAuthRepo.findByMemberAuthId(id);

		if (memberAuth == null || memberAuth.isEmpty()) {
			throw new EntityNotFoundException(MemberAuth.class, "id", id);
		}

		return memberAuth;
	}

	@Override
	public List<MemberAuth> getMemberAuthByMemberId(String id) {
		List<MemberAuth> memberAuth = memberAuthRepo.findByMemberAuthId(id);

		if (memberAuth == null || memberAuth.isEmpty()) {
			throw new EntityNotFoundException(MemberAuth.class, "id", id);
		}

		return memberAuth;
	}

	@Override
	public List<MemberAuth> authenticateMember(String userName, String authToken) {

		List<MemberAuth> memberAuth = memberAuthRepo.findByAuthToken(authToken);

		if (memberAuth == null || memberAuth.isEmpty()) {
			throw new EntityNotFoundException(MemberAuth.class, "authToken", authToken);
		}
		return memberAuth;
	}
}
