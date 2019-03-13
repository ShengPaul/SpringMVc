package com.xt.controller;

import com.xt.vo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value="/login")
    public String userLogin(HttpSession session){
        User user = new User(6,"小马","alibaba");
        session.setAttribute("user",user);
        return "loginSuccess";
    }

}
