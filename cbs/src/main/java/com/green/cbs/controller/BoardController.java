package com.green.cbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {

    @RequestMapping("/list")
    public String home(){
        return "/board/list";
    }
    
    @RequestMapping("/detail")
    public String detail(){
        return "/board/detail";
    }
    
    @RequestMapping("/delete")
    public String delete(){

        
        return "redirect:/board/list";
    }

    @RequestMapping("/writeForm")
    public String writeForm(){
        return "/board/write";
    }
    
    @RequestMapping("/write")
    public String write(){
        return "redirect:/board/list";
    }
}
