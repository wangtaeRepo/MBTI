package com.ykck.mbti.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class LoginDto {
    private String member_Id;
    private String member_Name;
    private String password;
    private String gender;
    private String birth;
    private String phoneNumber;
    private String address;
    private int type_Id;
}


