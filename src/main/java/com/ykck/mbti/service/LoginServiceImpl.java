package com.ykck.mbti.service;

import javax.servlet.http.HttpSession;

import com.ykck.mbti.dao.LoginDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao loginDao;
    
    public String login(String member_Id, String password, HttpSession session){        
        String dbpass=loginDao.login(member_Id);
		if(dbpass==null) {
			return "redirect:/login";
//			return LoginStatus.NOT_MEMBER;
		} else {
			if(dbpass.equals(password)) {
				session.setAttribute("member_Id", member_Id);
				return "redirect:/mbti";
//				return LoginStatus.LOGIN_OK;
			} else {    
				return "redirect:/login";
//				return LoginStatus.LOG  IN_FAIL;
			}
		}
	}
}
