package com.green.cbs.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    public int login(String id, String pwd);
    public void regist(String id, String pwd);
    public int idCheck(String id);
}
