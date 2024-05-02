package com.green.cbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.cbs.dao.BoardDao;
import com.green.cbs.dto.BoardDto;

@Service
public class BoardService {
	
    @Autowired
    BoardDao dao;
    
    public List<BoardDto>  getList(){
        List<BoardDto> list = dao.getList();
        return list;
    } 
}
