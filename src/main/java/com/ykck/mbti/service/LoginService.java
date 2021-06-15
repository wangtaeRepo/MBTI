package com.ykck.mbti.service;

import javax.servlet.http.HttpSession;

public interface LoginService {
    public String login(String member_Id, String password, HttpSession session);
}

