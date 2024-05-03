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
    
    public BoardDto get(int bno){
        return dao.get(bno);
    }

    public List<BoardDto> getForMeList(String reader){
        
        return dao.getForMeList(reader);
    }

    public void write(BoardDto boardDto){
        dao.write(boardDto);
    }

    public void delete(int bno){
        dao.delete(bno);
    }
}