package com.green.cbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.green.cbs.dto.BoardDto;

@Mapper
public interface BoardDao {

    public List<BoardDto> getList();
    public BoardDto get(int bno);
    public List<BoardDto> getForMe(String reader);
    public void write();
    public void delete();
}
