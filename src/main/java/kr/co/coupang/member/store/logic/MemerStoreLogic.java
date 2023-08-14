package kr.co.coupang.member.store.logic;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import kr.co.coupang.member.domain.Member;
import kr.co.coupang.member.store.MemberStore;

@Repository
public class MemerStoreLogic implements MemberStore {

	@Override
	public int insertMember(SqlSession sqlSession, Member member) {
		int result = sqlSession.insert("MemberMapper.insertMember", member);
		return result;
	}

	@Override
	public int updateMember(SqlSession sqlSession, Member member) {
		int result = sqlSession.update("MemberMapper.updateMember", member);
		return result;
	}

	@Override
	public int deleteMember(SqlSession sqlSession, String memberId) {
		int result = sqlSession.delete("MemberMapper.deleteMember", memberId);
		return result;
	}

	@Override
	public Member selectMemberLogin(SqlSession sqlSession, Member member) {
		Member mOne 
		= sqlSession.selectOne("MemberMapper.selectMemberLogin", member);
		return mOne;
	}

	@Override
	public Member selectOneById(SqlSession sqlSession, String memberId) {
		Member member = sqlSession.selectOne("MemberMapper.selectOneById", memberId);
		return member;
	}


}









