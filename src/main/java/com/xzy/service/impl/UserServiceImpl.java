package com.xzy.service.impl;

import javax.annotation.Resource;

import com.xzy.domain.User;
import com.xzy.service.IBaseService;
import com.xzy.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl extends BaseService implements IUserService {

	@Resource(name="baseService")
	private IBaseService baseService;
	
	public User getByAccount(String account){
		User user = null;
		try {
			user = (User) baseService.getUniqueResultByJpql("from User as o where o.account=?", account);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;
	}
	
	public boolean register(User user){
		boolean flag = false;
		try {
			baseService.save(user);
			flag = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
}
