package com.ykck.mbti.controller;

import com.ykck.mbti.dto.Type;
import com.ykck.mbti.service.TypeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mbti")
public class TypeController {
    
    @Autowired
    TypeService typeService;

    @GetMapping("/type-result")
    public String getTypeById(int type_id,Model model){
        Type type = typeService.getTypeById(type_id);
        model.addAttribute("type", type);
        return "type/type-result";
    }
}
