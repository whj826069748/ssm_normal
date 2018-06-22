package com.ssm.whj.service;

import com.ssm.whj.database.entity.User;

import java.util.List;
import java.util.Map;

public interface IUserService {

	public User getUserById(int id);

	public List<Map> selectByAge(int age);
}

