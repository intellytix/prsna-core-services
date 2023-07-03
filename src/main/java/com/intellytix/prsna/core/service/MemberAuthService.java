package com.intellytix.prsna.core.service;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.MemberAuth;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberAuthService {
	
	public List<MemberAuth> getMemberAuthById(String id);

	public List<MemberAuth> getMemberAuthByMemberId(String id);

	public List<MemberAuth>  authenticateMember(String userName, String authToken);


}
