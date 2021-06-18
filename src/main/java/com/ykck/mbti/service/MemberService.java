package com.ykck.mbti.service;

import com.ykck.mbti.dao.*;
import java.util.*;
import com.ykck.mbti.dto.*;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;


@Service
public class MemberService {

    @Autowired
    MemberDao memberDao;

    public List<LoginDto> getMemberList(){
        return memberDao.getMemberList();
    }

    public void insertMember(LoginDto loginDto){
        memberDao.insertMember(loginDto);
    }

    public void updateMemberType(int type_id) {
        memberDao.updateMemberType(type_id);
    }
}




