package com.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.entity.userinfo;
import com.mapper.userMapper;
import com.service.userService;
@Service("userService")
public class userImpl implements userService {
	private userMapper uMapper;
	@Override
	public List<userinfo> queryUser() {
		// TODO Auto-generated method stub
		return uMapper.queryUser();
	}

	@Override
	public userinfo findInfoById(int id) {
		// TODO Auto-generated method stub
		return uMapper.findInfoById(id);
	}

	@Override
	public void insertUser(userinfo insInfo) {
		// TODO Auto-generated method stub
		uMapper.insertUser(insInfo);
	}

	@Override
	public void UpdateUser(userinfo updInfo) {
		// TODO Auto-generated method stub
		uMapper.UpdateUser(updInfo);
	}

	@Override
	public void DeleteUser(int delInfo) {
		// TODO Auto-generated method stub
		uMapper.DeleteUser(delInfo);
	}

}
