package com.intellytix.prsna.core.repo;

import com.intellytix.prsna.core.entity.Member;
import com.intellytix.prsna.core.entity.MemberAuth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberAuthRepo extends JpaRepository<MemberAuth, String>{

	public MemberAuth save(MemberAuth memberAuth);

	@Query(nativeQuery = true , value = "select * from prsna.member_auth where member_id = :memberId")
	public List<MemberAuth> findByMemberId(@Param("memberId") String memberId);

	@Query(nativeQuery = true , value = "select * from prsna.member_auth where member_auth_id = :memberAuthId")
	public List<MemberAuth> findByMemberAuthId(@Param("memberAuthId") String memberAuthId);

	@Query(nativeQuery = true , value = "select * from prsna.member_auth where auth_token = :authToken")
	public List<MemberAuth> findByAuthToken(@Param("authToken") String authToken);
}


