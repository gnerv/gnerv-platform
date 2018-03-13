package com.gnerv.platform.user.service;

import org.springframework.stereotype.Service;

import com.gnerv.platform.user.model.User;

@Service
public interface IUserService {
	
	/**
	 * 创建一个新用户
	 * @param user
	 * @return true 成功  false 失败
	 */
	boolean createUser(User user);
}
