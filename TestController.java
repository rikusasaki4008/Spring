package com.example.demo;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	private final JdbcTemplate jdbcTemplate;

	@Autowired
	public TestController(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@GetMapping("/test")
	public String test(Model model) {
		//    	ID：1を取得
		String sql1 = "SELECT id, name, email FROM users WHERE id = 1";

		Map<String, Object> map1 = jdbcTemplate.queryForMap(sql1);

		model.addAttribute("id1", map1.get("id"));
		model.addAttribute("name1", map1.get("name"));
		model.addAttribute("email1", map1.get("email"));

		//    	ID：2を取得
		String sql2 = "SELECT id, name, email FROM users WHERE id = 2";

		Map<String, Object> map2 = jdbcTemplate.queryForMap(sql2);

		model.addAttribute("id2", map2.get("id"));
		model.addAttribute("name2", map2.get("name"));
		model.addAttribute("email2", map2.get("email"));

		//    	ID：3を取得
		String sql3 = "SELECT id, name, email FROM users WHERE id = 3";

		Map<String, Object> map3 = jdbcTemplate.queryForMap(sql3);

		model.addAttribute("id3", map3.get("id"));
		model.addAttribute("name3", map3.get("name"));
		model.addAttribute("email3", map3.get("email"));

		//    	各種値を取得
		model.addAttribute("idh", "ID");
		model.addAttribute("nameh", "名前");
		model.addAttribute("emailh", "メールアドレス");
		model.addAttribute("title", "ユーザ定義");

		return "test";
	}
}
