package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.User;

public interface UserDao   {
	List<User> findAll();
}
