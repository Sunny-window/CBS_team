package com.green.cbs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.green.cbs.dao.UserDao;

@Service
public class UserService {

	@Autowired
	UserDao dao;

	public int login(String id, String pwd) {
		int result = dao.login(id, pwd);

		return result;
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
