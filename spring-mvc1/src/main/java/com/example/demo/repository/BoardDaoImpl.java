package com.example.demo.repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Board;

@Repository
public class BoardDaoImpl implements BoardDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public BoardDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Board> findAll() {
		String sql = "SELECT title, content, update_at FROM boards ORDER BY update_at DESC";

		List<Map<String, Object>> results = jdbcTemplate.queryForList(sql);

		List<Board> boardList = new ArrayList<>();
		for (Map<String, Object> map : results) {
			Board board = new Board();
//			タイトルをSET
			board.setTitle((String) map.get("title"));
//			つぶやきをSET
			board.setContent((String) map.get("content"));
//			更新日をSET
			Timestamp timestamp = (Timestamp) map.get("update_at");
			LocalDateTime localDateTime = timestamp.toLocalDateTime();
			board.setUpdateAt(localDateTime);
			boardList.add(board);
		}

		return boardList;
	}

}
