package com.neuedu.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.neuedu.entity.User;
import com.neuedu.mapper.UserMapper;
import com.neuedu.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;


	@Override
	public String getUserWelcome() {
		return userMapper.selectById(1).getName();
	}
	//根据id删除用户
	@Override
	public int deleteUserById(Integer id) {
		return userMapper.deleteById(id);
	}
	//添加用户
	@Override
	public int insertUser(User user) {
		return userMapper.insert(user);
	}
	//修改用户
	@Override
	public int updataUser(User user) {
		return userMapper.updateById(user);
	}
	//查询用户
	@Override
	public List<User> selectUser(){
		return userMapper.selectList(null);
	}
	//根据用户名称查询用户
	@Override
	public List<User> selectUser(String name) {
		QueryWrapper<User> query = new QueryWrapper<>();
		query.like("name", name);
		return userMapper.selectList(query);
	}
}
