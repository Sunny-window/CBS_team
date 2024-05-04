package com.green.cbs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.cbs.dao.UserDao;
import com.green.cbs.dto.UserDto;

@Service
public class UserService {

	@Autowired
	UserDao dao;

	public List<UserDto> login(String id, String pwd) {
		
		List<UserDto> result = dao.login(id, pwd);
		
		// 유효성 검사를 service에서 하나? controller에서 하나?
		// 일단 controller로 넘기자
		
		return result; // 컨트롤러 받아라
	}

	public void regist(String id, String pwd) {

		dao.regist(id, pwd);

	}

	public int idCheck(String id) {

		if (id.length() > 12) {

			return 0;

		} else {

			return dao.idCheck(id);
		}

	}

}
