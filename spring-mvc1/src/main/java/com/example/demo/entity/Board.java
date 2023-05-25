package com.example.demo.entity;

import java.time.LocalDateTime;

public class Board {
	
	
	private int id;
	private String title;
	private String content;
	private LocalDateTime createAt;
	private LocalDateTime updateAt;
	
	public Board() {}

	public Board(int id, String title, String content, LocalDateTime createAt, LocalDateTime updateAt) {
		this.id = id;
		this.title = title;
		this.content = content;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}

}
