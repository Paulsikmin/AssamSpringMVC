package kr.co.coupang.member.store;

import org.apache.ibatis.session.SqlSession;

import kr.co.coupang.member.domain.Member;

public interface MemberStore {
	
	public int insertMember(SqlSession sqlSession, Member member);

	public int deleteMember(SqlSession sqlSession, String memberId);

	public Member selectMemberLogin(SqlSession sqlSession, Member member);
	
	public Member selectOneById(SqlSession sqlSession, String memberId);

	public int updateMember(SqlSession sqlSession, Member member);

}
