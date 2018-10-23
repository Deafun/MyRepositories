package com.mapper;

import java.util.List;

import com.entity.userinfo;

public interface userMapper {
	public List<userinfo> queryUser();
	public userinfo findInfoById(int id);
	public void insertUser(userinfo insInfo);
	public void UpdateUser(userinfo updInfo);
	public void DeleteUser(int delInfo);
}
