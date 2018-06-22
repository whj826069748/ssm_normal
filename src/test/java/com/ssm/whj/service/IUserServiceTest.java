package com.ssm.whj.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssm.whj.database.entity.User;
import com.ssm.whj.service.IUserService;

import java.util.List;
import java.util.Map;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({ "classpath:applicationContext.xml"})
public class IUserServiceTest {

	@Autowired
	public IUserService userService;
	
	@Test
	public void getUserByIdTest(){
		User user = userService.getUserById(1);
		System.out.println(user.getName());
	}


	@Test
	public void getMapByAge(){
		List<Map> list= userService.selectByAge(11);
		System.out.println(list);

	}
	
}
