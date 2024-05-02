package com.green.cbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.cbs.dao.BoardDao;

@Service
public class BoardService {
	
    @Autowired
    BoardDao dao;
    
}
