package com.wyhello.jeasyuidemo.service;

import java.util.List;

import com.wyhello.jeasyuidemo.pojo.User;

public interface UserService {
	
	
	public List<User> queryAllUser();
	public void addUser(User u);
	public void updateUser(User u);
	public void removeUser(User u);
}
