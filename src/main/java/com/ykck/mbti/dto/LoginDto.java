package com.ykck.mbti.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginDto {
    private int member_Id;
    private String member_Name;
    private String password;
    private String gender;
    private String birth;
    private String phoneNumber;
    private String address;
    private int type_Id;
}


