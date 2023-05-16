package com.memberRegistry.Dao;

import java.util.List;

import com.memberRegistry.model.Member;


public interface MemberRepository {

	public int save(Member member);
	
	public Member get(String id);
	
	public int delete(String id);
	
	public int update(Member member);
	
	public List<Member> list();
}