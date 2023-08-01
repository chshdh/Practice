package com.neuedu.service;
import java.util.List;

import com.neuedu.entity.User;
public interface UserService {
	public String getUserWelcome();
	public int deleteUserById(Integer id);
	int insertUser(User user);
	public int updataUser(User user);
	public List<User> selectUser();

	public List<User> selectUser(String name);
}

