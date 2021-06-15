package com.ykck.mbti.service;

import javax.servlet.http.HttpSession;

public class LoginServiceImpl {
    public String login(String member_Id, String password, HttpSession session){
//         String dbpass=LoginDao.login(member_Id));
// 		if(dbpass==null) {
// 			return "redirect:/join.chain";
// //			return LoginStatus.NOT_MEMBER;
// 		} else {
// 			if(dbpass.equals(password)) {
// 				session.setAttribute("id", id);
// 				return "redirect:/main.chain";
// //				return LoginStatus.LOGIN_OK;
// 			} else {
// 				return "redirect:/login.chain";
// //				return LoginStatus.LOGIN_FAIL;
// 			}
// 		}
        return null;
	}
}
