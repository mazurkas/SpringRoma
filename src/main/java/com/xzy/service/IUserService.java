package com.xzy.service;

import com.xzy.domain.User;

public interface IUserService extends IBaseService{
	
	public User getByAccount(String account);

	public boolean register(User user);
}
