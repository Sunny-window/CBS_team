package com.green.cbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.green.cbs.dto.UserDto;

@Mapper
public interface UserDao {
    public List<UserDto> login(String id, String pwd);
    public void regist(String id, String pwd);
    public int idCheck(String id);
}
