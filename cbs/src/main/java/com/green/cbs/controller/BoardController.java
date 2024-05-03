package com.green.cbs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.green.cbs.dto.BoardDto;
import com.green.cbs.service.BoardService;

import jakarta.servlet.http.HttpServletRequest;


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
    public String detail(HttpServletRequest req, Model model){
        String bno_ = req.getParameter("bno");
        int bno = Integer.parseInt(bno_);
        BoardDto dto = service.get(bno);
        model.addAttribute("board", dto);
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
    public String write(HttpServletRequest req){
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        String writer = req.getParameter("writer");
        String reader = req.getParameter("reader");

        service.write(new BoardDto(0, title, content, reader, writer));

        return "redirect:/board/list";
    }

    @RequestMapping("/listForMe")
    public String listForMe(){
        // DB에서 나한테 온 게시글만 리스트로 가져오기
        return "/user/userPage";
    }
}
