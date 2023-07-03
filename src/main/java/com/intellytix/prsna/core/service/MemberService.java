package com.intellytix.prsna.core.service;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.Organization;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {
	
	public List<Member> getMemberById(Long id);

}
