package kr.co.coupang.member.service;

import kr.co.coupang.member.domain.Member;

public interface MemberService {
	/**
	 * 멤버 등록 Service
	 * @param member
	 * @return int
	 */
	public int registerMember(Member member);

	/**
	 * 회원 탈퇴
	 * @param memberId
	 * @return
	 */
	public int removeMember(String memberId);

	/**
	 * 멤버 로그인 Service
	 * @param 아이디, 비번
	 * @return member객체
	 */
	public Member memberLoginCheck(Member member);
	
	/**
	 * 회원 상세 조회
	 * @param memberId
	 * @return
	 */
	public Member showOneById(String memberId);

	/**
	 * 회원 정보 수정
	 * @param member
	 * @return
	 */
	public int updateMember(Member member);
}
