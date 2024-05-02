package com.green.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.cbs.dto.BoardDto;
import com.green.cbs.service.BoardService;


@Controller
@RequestMapping("/board")
public class BoardController {

    @Autowired
    BoardService service;
    
    @RequestMapping({"/list","/"})
    public String listView(Model model){
        model.addAttribute("list",service.getList());
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
        return "/board/writeForm";
    }
    
    @RequestMapping("/write")
    public String write(){
        return "redirect:/board/list";
    }
}
