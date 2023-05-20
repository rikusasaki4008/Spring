package com.example.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class TestController {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public TestController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	@Autowired
	private UserService userService;

	@GetMapping("/test")
	public String test(Model model) {
		//    	レコードを取得
		String sql = "SELECT id, name, email FROM users ORDER BY id ASC";

		List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);

		model.addAttribute("results", results);

		//    	タイトルを取得
		model.addAttribute("title", "ユーザ定義");
		
//		テスト
		List<User> userlist = userService.getAll();
		model.addAttribute("userlist", userlist);

		return "test";
	}
}
