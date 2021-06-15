package com.ykck.mbti.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MemberDto {
    private String MEMBER_NAME;
    private String PASSWORD;
    private String GENDER;
    private String BIRTH;
    private String PHONENUMBER;
    private String ADDRESS;
    private int TYPE_ID;
}
