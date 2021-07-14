package com.example.memberadmin.repository;

import com.example.memberadmin.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataMemberRepository extends JpaRepository<Member,Long>, MemberRepository {

    @Override
    Optional<Member> findByName(String name);
    // 일반적으로 대부분의 연산을 JpaRepository에서 제공한다.

}
