package com.example.demo.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "User") // 테이블명을 명시
public class User {

    @Id //기본 키
    @GeneratedValue(strategy = GenerationType.IDENTITY) //기본 키의 값을 자동으로 생성
    @Column(name = "uNum") // 컬럼명을 명시
    private Integer uNum;
    @Column(name = "uName")
    @NotNull
    private String uName;
    @Column(name = "uGender")
    @NotNull
    private String uGender;
    @Column(name = "uBirthDate")
    @NotNull
    private String uBirthDate;
    @Column(name = "uID")
    @NotNull
    private String uID;
    @Column(name = "uPW")
    @NotNull
    private String uPW;
    @Column(name = "uTel")
    @NotNull
    private String uTel;
    @Column(name = "uAdr")
    @NotNull
    private String uAdr;
    @Column(name = "uEmail")
    @NotNull
    private String uEmail;
    @Column(name = "uProfileImage")
    private String uProfileImage;
    @Column(name = "tag")
    private Integer tag;

    public Integer getTag() {
        return this.tag;
    }


    // getters and setters
}