package com.green.cbs.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.green.cbs.dto.BoardDto;

@Mapper
public interface BoardDao {

    public List<BoardDto> getList();
    public BoardDto get(int bno);
    public List<BoardDto> getForMeList(String reader);
    public void write(@Param("boardDto")BoardDto boardDto);
    public void delete(int bno);
}
