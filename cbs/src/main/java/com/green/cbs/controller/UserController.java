package com.green.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.cbs.service.UserService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;


    @RequestMapping("/userPage")
    public String userPage(){

        return "/user/userPage";
    }
    
    @RequestMapping("/regist")
    public String regist(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        String password = request.getParameter("pwd");
        
        // db에서 유저들 아이디 목록을 가져와서 하나하나 비교한다.
        // ->
        // 사용자가 입력한 ID가 DB에 존재하는지 체크한다.
        

        // id가 이미 존재하는지? 
        // id가 존재하지 않는다면
        // id와 password를 db에 저장한다

        return "";
    }
    
}
