package com.wyhello.jeasyuidemo.dao;

import java.util.List;

import com.wyhello.jeasyuidemo.pojo.User;

public interface UserDAO {
	
	public List<User> queryAll();
	public void add(User u);
	public void update(User u);
	public void remove(User u);
}
