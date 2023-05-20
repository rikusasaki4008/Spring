package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.demo.entity.User;

public class UserDaoImpl implements UserDao {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	List<User> userList = new ArrayList<>();
	
	String sql = "SELECT id, name, email FROM users WHERE id = 1";
	
	Map<String, Object> map = jdbcTemplate.queryForMap(sql);

	@Override
	public List<User> findAll() {
		User user1 = new User();
		user1.setId(map.get("id"));
		user1.setName(map.get("name"));
		user1.setEmail(map.get("email"));
		userList.add(user1);

		return userList;
	}

}
