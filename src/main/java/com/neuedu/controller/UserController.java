package com.neuedu.controller;
import java.util.List;

import com.neuedu.entity.Script;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neuedu.entity.User;
import com.neuedu.service.UserService;

//加上注解：表示控制类
@RestController
//运行前端跨域访问
@CrossOrigin
public class UserController {
	//注入 创建对象
	@Autowired
	private UserService userService;


	//给前端返回字符串的地址
	@RequestMapping("/welcome")
	public String welcome() {
		//调用类中的方法，将方法返回值赋值给变量s
		String s = userService.getUserWelcome();
		return s;
	}
	@RequestMapping("/delete")
	public String delete(Integer id) {
		System.out.println(id);
		userService.deleteUserById(id);
		return "ok";
	}
	//得到所有用户
	@RequestMapping("/select")
	public List<User> selectUser(){
		return userService.selectUser();
	}
	//搜索用户方法
	@RequestMapping("searchUser")
	public List<User> searchUser(String name) {
		return userService.selectUser(name);
	}
	@RequestMapping("addUser")
	public Integer add(String name,Integer age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		return userService.insertUser(user);
	}
	//修改方法
	@RequestMapping("updataUser")
	public Integer updata(Long id,String name,Integer age) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setAge(age);
		return userService.updataUser(user);
	}


	

	
	
}
