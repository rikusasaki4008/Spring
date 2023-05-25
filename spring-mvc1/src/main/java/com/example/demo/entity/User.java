package com.example.demo.entity;

import java.time.LocalDateTime;

public class User {
	private int id;
	private String name;
	private String email;
	private LocalDateTime createAt;
	private LocalDateTime updateAt;

	public User() {
	}

	public User(int id, String name, String email, LocalDateTime createAt, LocalDateTime updateAt) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.createAt = createAt;
		this.updateAt = updateAt;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getcreateAt() {
		return createAt;
	}

	public void setcreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public LocalDateTime getupdateAt() {
		return updateAt;
	}

	public void setupdateAt(LocalDateTime updateAt) {
		this.updateAt = updateAt;
	}

}
