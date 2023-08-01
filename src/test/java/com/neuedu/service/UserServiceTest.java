package com.neuedu.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.neuedu.entity.User;

@SpringBootTest
public class UserServiceTest {
	@Autowired
	private UserService userService;
	
//	@Test
	public void deleteUserByIdTest() {
		int num = userService.deleteUserById(3);
		Assert.isTrue(num==1, "删除失败，id不存在", null);
	}
//	@Test
	public void insertUserTest() {
		User user = new User();
		user.setName("李四");
		user.setAge(23);
		userService.insertUser(user);
	}
	@Test
	public void updataUserTest() {
		User user = new User();
		user.setId(1L);
		user.setName("张三");
		user.setAge(18);
		userService.updataUser(user);
	}
	@Test
	public void selectUserTest() {
		List<User>  userList = userService.selectUser();
		for(int i=0;i<userList.size();i++) {
			User user = userList.get(i);
			System.out.println(user.getName()+":"+user.getAge());
		}
	}
}
