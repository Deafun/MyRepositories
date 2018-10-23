package com.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.entity.userinfo;
import com.service.userService;
@Controller
public class userController {
	@Resource
	private userService uService;
	
	@RequestMapping("/queryUserController")
	public String queryUser(Model model) {
		model.addAttribute("userList",uService.queryUser());
		return "/index.jsp";
	}
	
	@RequestMapping(value = "/findInfoByController")
	public String findInfoById(HttpServletRequest request,int id) {
		request.setAttribute("userlist", uService.findInfoById(id));
		return "/update";
	}
	
	@RequestMapping(value = "/insertUserController",method = RequestMethod.POST)
	public String insertUser(userinfo insInfo){
		uService.insertUser(insInfo);
		return "redirect:/queryUserController";
	};
	
	@RequestMapping(value = "/updateUserController",method = RequestMethod.POST)
	public String UpdateUser(userinfo updInfo){
		uService.UpdateUser(updInfo);
		return "redirect:/queryUserController";
	};
	
	@RequestMapping(value = "/deleteInfoByIdController")
	public String DeleteUser(int id){
		uService.DeleteUser(id);
		return "redirect:/queryUserController";
	};
	
}
