package com.simplespring.user.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.simplespring.user.service.UserService;

@Controller
public class LoginController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView("login");
		Map map = new HashMap<String, Object>();
		map.put("name", "huang");
		int count = service.getUserCount(map);
		System.out.println(count);
		return mv;
	}
}
