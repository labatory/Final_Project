package com.example.demo.Service;

import com.example.demo.DTO.MemberDTO;
import com.example.demo.Entity.MemberEntity;
import com.example.demo.Repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void save(MemberDTO memberDTO) {
        // 1. dto -> entity변환
        // 2. repository.save(entity)
        MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);// dto -> entity 변환
        memberRepository.save(memberEntity);

        // repository의 save메소드 호출 (조건.entity 객체를 넘겨줘야 함)


    }
    public MemberDTO login (MemberDTO memberDTO) {
            /*
              1. 회원이 입력한 이메일로 DB에서 조회를 함
              2. DB에서 조회한 비밀번호와 사용자가 입력한 비밀번호가 일치하는지 판단
             */
        Optional<MemberEntity> byMemberEmail = memberRepository.findByMemberEmail(memberDTO.getMemberEmail());
        if (byMemberEmail.isPresent()) {
            // 조회 결과가 있다(해당 이메일을 가진 회원 정보가 있다)
            MemberEntity memberEntity = byMemberEmail.get();
            if (memberEntity.getMemberPassword().equals(memberDTO.getMemberPassword())) {
                // 비밀번호가 일치한다
                // entity -> dto 변환후 리턴
                MemberDTO dto = MemberDTO.toMemberDTO(memberEntity);
                return dto;
            } else {
                // 비밀번호가 일치하지 않는다
                return null;
            }
        } else {
            // 조회 결과가 없다(해당 이메일을 가진 회원 정보가 없다)
            return null;
        }
    }
}
