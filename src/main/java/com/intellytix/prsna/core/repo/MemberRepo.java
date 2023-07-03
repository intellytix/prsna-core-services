package com.intellytix.prsna.core.repo;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.Organization;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepo extends JpaRepository<Member, String>{

	public Member save(Member member);

	@Query(nativeQuery = true , value = "select * from prsna.member where member_id = :id")
	public List<Member> findByMemberId(@Param("id") Long id);
	
}


