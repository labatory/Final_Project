package com.example.demo.DTO;

import com.example.demo.Entity.MemberEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;
    public void setId(Long id) {
        this.id = id;
    }
    public void setMemberEmail(String MemberEmail) {
        this.memberEmail = memberEmail;
    }
    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }
    public void setMemberName(String MemberName) {
        this.memberName = memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }
    public String getMemberPassword() {
        return memberPassword;
    }
    public String getMemberName() {
        return memberName;
    }

    public static MemberDTO toMemberDTO(MemberEntity memberEntity){
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());
        return memberDTO;
    }


}

