package com.example.demo.Repository;

import com.example.demo.Entity.MemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<MemberEntity, Long> { //<Entity, PK Type>
    // 이메일로 회원 정보 조회(select * from member where member_email = ?)
    Optional<MemberEntity> findByMemberEmail(String memberEmail);
}
