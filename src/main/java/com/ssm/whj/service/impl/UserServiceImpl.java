package com.ssm.whj.service.impl;

import com.ssm.whj.database.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.whj.database.entity.User;
import com.ssm.whj.service.IUserService;

import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements IUserService{

	@Autowired
	public UserDAO userDAO;
	
	@Override
	public User getUserById(int id) {
		return userDAO.selectByPrimaryKey(id);
	}

	@Override
	public List<Map> selectByAge(int age) {
		return userDAO.selectByAge(age);
	}

}
