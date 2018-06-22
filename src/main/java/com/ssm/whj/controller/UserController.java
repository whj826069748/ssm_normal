package com.ssm.whj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssm.whj.common.system.BaseClass;
import com.ssm.whj.database.entity.User;
import com.ssm.whj.service.IUserService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/user")
public class UserController extends BaseClass{

	@Autowired
	private IUserService userService;
	
	@RequestMapping(value="/showname",method=RequestMethod.GET)
	public String showUserName(@RequestParam("id") int id,HttpServletRequest request,Model model){
		logger.info("id:"+id);
		User user = userService.getUserById(id);
		if(user != null){
			request.setAttribute("name", user.getName());
			model.addAttribute("mame", user.getName());
			return "showName";
		}
		request.setAttribute("error", "未找到");
		return "error";
	}

	@RequestMapping(value="/showStr",method=RequestMethod.GET)
	@ResponseBody
	public String showStr(@RequestParam("id") int id,HttpServletRequest request,Model model){
		return "helloworld";
	}
}
