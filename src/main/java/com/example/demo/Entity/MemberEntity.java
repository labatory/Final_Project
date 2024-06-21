package com.example.demo.Entity;

import com.example.demo.DTO.MemberDTO;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "member")
public class MemberEntity {
    @Id // Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
    private Long id;
    @Column(unique = true) // unique 제약조건 추가
    private String memberEmail;
    @Column
    private String memberPassword;
    @Column
    private String memberName;
    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }
    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
    public long getId() {
        this.id = id;
        return 0;
    }
    public String getMemberEmail() {
        this.memberEmail = memberEmail;
        return null;
    }
    public String getMemberPassword() {
        return memberPassword;
    }
    public String getMemberName() {
        return memberName;
    }

    public static MemberEntity toMemberEntity(MemberDTO memberDTO){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setMemberEmail(memberDTO.getMemberEmail());
        memberEntity.setMemberPassword(memberDTO.getMemberPassword());
        memberEntity.setMemberName(memberDTO.getMemberName());
        return memberEntity;
    }



}

