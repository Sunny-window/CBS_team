package com.green.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.cbs.service.UserService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService service;


    @RequestMapping("/userPage")
    public String userPage(){
    	
    	return "redirect:/board/listForMe";
    }
    
    @RequestMapping("/regist")
    public String regist(HttpServletRequest request, Model model){
        String id = request.getParameter("id");
        String password = request.getParameter("pwd");
        
        int result = service.idCheck(id);
        
        if(result == 1) {
        	
        	return "/user/loginForm"; //중복 있으면 ??하겠다
        	
        }else {
        	service.regist(id, password);
        	
        	return "/user/loginForm"; //중복이 안되서 ?? 한다
        }
        
        // db에서 유저들 아이디 목록을 가져와서 하나하나 비교한다.
        // ->
        // 사용자가 입력한 ID가 DB에 존재하는지 체크한다.
        

        // id가 이미 존재하는지? 
        // id가 존재하지 않는다면
        // id와 password를 db에 저장한다
        
    }
    
    @RequestMapping("/registForm")
    public String registForm() {
    	
		return "/user/registForm";
    }
    
    @RequestMapping("/login")
    public String login(@RequestParam("id") String id, @RequestParam("pwd") String pwd, HttpSession session) {
    	
    	int result = service.login(id, pwd);
    	
    	if(result == 1) {
    		
    		session.setAttribute("id", id);
    		
    		return "/user/userPage";
    		
    	}else {
    		    		
    		return "/user/loginForm";
    	}
    }
    
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
    	
    	HttpSession session = request.getSession();
         
    	session.invalidate();
    	
    	return "redirect:/";
    }
    
    @RequestMapping("/loginForm")
    public String loginForm() {
    	
    	return "/user/loginForm";
    }
    
}
