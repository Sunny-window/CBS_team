package com.green.cbs.controller;

import java.sql.ResultSet;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.green.cbs.dto.UserDto;
import com.green.cbs.service.UserService;

import ch.qos.logback.core.model.Model;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
@Component
public class UserController {

	@Autowired
	UserService service;
	@Autowired
	UserDto dto;

	@RequestMapping("/userPage")
	public String userPage() {

		return "/board/listForMe";
	}

	@RequestMapping("/regist")
	public String regist(HttpServletRequest request, Model model) {
		String id = request.getParameter("id");
		String password = request.getParameter("pwd");

		int result = service.idCheck(id);

		if (result == 1) {

			return "/user/loginForm"; // 중복 있으면 ??하겠다 -> 난 중복이 있으면... 어떻게 할까?
			// 중복이 있으면 1. aler창을 띄운다 2. 옆에다가 중복 아이디라고 알린다.
			// 2로 가보자

		} else {
			service.regist(id, password);

			return "/user/loginForm"; // 중복이 안되서 ?? 한다
		}

		// db에서 유저들 아이디 목록을 가져와서 하나하나 비교한다.
		// ->
		// 사용자가 입력한 ID가 DB에 존재하는지 체크한다.

		// id가 이미 존재하는지?
		// id가 존재하지 않는다면
		// id와 password를 db에 저장한다

	}

	@RequestMapping("/registForm")
	public String registForm() {

		return "/user/registForm";
	}

	@RequestMapping("/login")
	public String login(@RequestParam("id") String id, @RequestParam("pwd") String pwd, HttpSession session) {

		List<UserDto> result = service.login(id, pwd); // 서비스가 넘겨준 결과를 받았다. 이제 처리하자
		if (result.get(0).getCount() == 1) {// 1 성공. 세션에 넣자

			session.setAttribute("id", id);
			session.setAttribute("name", result.get(0).getName());

			return "/user/myPage"; // 마이 페이지로 가자

		} else {

			return "/user/loginForm";
		}
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) {

		HttpSession session = request.getSession();

		session.invalidate();

		return "../index";
	}

	@RequestMapping("/loginForm")
	public String loginForm() {

		return "/user/loginForm";
	}

}
