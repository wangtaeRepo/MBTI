package com.ykck.mbti.controller;

import javax.servlet.http.HttpSession;

import com.ykck.mbti.service.LoginService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MemberController {
    
    @Autowired
    LoginService loginService;

	@PostMapping("member/login")
	public String login(@RequestParam("member_Id") String member_Id, @RequestParam("password") String password, 
			HttpSession session) {
		return loginService.login(member_Id, password, session);
	}
}
