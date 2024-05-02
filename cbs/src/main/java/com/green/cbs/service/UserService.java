package com.green.cbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.cbs.dao.UserDao;

@Service
public class UserService {
    @Autowired
    UserDao dao;
    
    public int login(String id, String pwd){
        int result = dao.login(id, pwd);
        
        return result;
    }
}
