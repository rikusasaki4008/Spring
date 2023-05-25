package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.User;

@Repository
public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<User> findAll() {
		String sql = "SELECT id, name, email FROM users ORDER BY id ASC";

		List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);

		List<User> userList = new ArrayList<>();
		for (Map<String, Object> map : result) {
			User user = new User();
			user.setId((int) map.get("id"));
			user.setName((String) map.get("name"));
			user.setEmail((String) map.get("email"));
			userList.add(user);
		}
		return userList;
	}

}
