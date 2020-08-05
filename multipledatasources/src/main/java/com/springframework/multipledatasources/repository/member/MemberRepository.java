package com.springframework.multipledatasources.repository.member;


import com.springframework.multipledatasources.model.member.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}