package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class TestController {

	
	@Autowired
	private UserService userService;
	
	public TestController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/test")
	public String test(Model model) {
		//    	レコードを取得
		List<User> user = userService.getAll();
		model.addAttribute("user", user);

		//    	タイトルを取得
		model.addAttribute("title", "ユーザ定義");
		


		return "test";
	}
}
