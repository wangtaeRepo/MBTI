package com.ykck.mbti.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import com.ykck.mbti.dto.LoginDto;
import com.ykck.mbti.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mbti")
public class MemberController {

    @Autowired MemberService memberService;
    /*
	로그인 페이지
	*/
    @GetMapping("/login")
    public String getLogin() {
        return "member/login";
    }

    @GetMapping("/logout")
    public String getLogout(Model model, HttpSession session){
        session.invalidate();

        return "member/login";

    }

    /*
	ID, PW Checking
	*/
    @PostMapping("/login")
    public String login(
        @ModelAttribute(name = "loginDto")LoginDto loginDto,HttpSession session, Model model) {
        
        String memeber_Id = loginDto.getMember_Id();
        String password = loginDto.getPassword();
        // System.out.println(loginDto);  -- 입력 데이터값 확인

        List<LoginDto> memberList = memberService.getMemberList();
        LoginDto loginMember = null;
        System
            .out
            .println(memberList);

        for (LoginDto members : memberList) {
            if (members.getMember_Name().equals(memeber_Id) && members.getPassword().equals(password)) {
                loginMember = members;
                session.setAttribute("SID", members.getMember_Name());    
                model.addAttribute("SID", session.getAttribute("SID"));
                System.out.println(session.getAttribute("SID"));
				System.out.println("success");
                return "/home";
            }
        }
        
		System.out.println("fail");
		model.addAttribute("invalidCredentials", false);
        return "redirect:/mbti/login";
        // if("왕태현".equals(memeber_Id) && "1234".equals(password)) { 	return
        // "redirect:/mbti/home"; }

    }


    @PostMapping("/sign")
    public String postProduct(Model model, @ModelAttribute LoginDto loginDto) {
        memberService.insertMember(loginDto);
        model.addAttribute("loginDto", loginDto);
        System.out.println(loginDto);

        return "redirect:/mbti/survey";
        // log.info("/mbti/sign... POST : " + loginDto.toString());
    }
}