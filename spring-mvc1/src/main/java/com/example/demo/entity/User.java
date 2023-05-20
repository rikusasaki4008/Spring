package com.example.demo.entity;

public class User {
	private Object id;
	private Object name;
	private Object email;
	
	public User() {}

	public User(Object id, Object name, Object email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Object getId() {
		return id;
	}

	public void setId(Object id) {
		this.id = id;
	}

	public Object getName() {
		return name;
	}

	public void setName(Object name) {
		this.name = name;
	}

	public Object getEmail() {
		return email;
	}

	public void setEmail(Object email) {
		this.email = email;
	}

}
