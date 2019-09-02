/**
 * Copyright (c) 2019, wenwenliuyun@163.com All Rights Reserved. 
 */

package com.liuyun.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liuyun.dao.IUserDao;
import com.liuyun.domain.User;
import com.liuyun.service.IUserService;

/**
 * Function: TODO <br>
 *
 * @author liuyun
 * @version
 * @since 2019年8月29日下午7:43:54
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	@Override
	public long count() throws Exception {
		System.out.println("Service的count执行");
		return userDao.count();
	}

	@Override
	public int deleteById(Integer id) throws Exception {
		return userDao.deleteById(id);
	}

	@Override
	public int insert(User record) throws Exception {
		return userDao.insert(record);
	}

	@Override
	public int update(Integer id, User record) throws Exception {
		if (id == null || record == null) {
			throw new RuntimeException("update input params cannot be null...");
		}
		record.setId(id);
		return userDao.update(record);
	}

	@Override
	public List<User> findAll() throws Exception {
		return userDao.findAll();
	}

	@Override
	public User findById(Integer id) throws Exception {
		return userDao.findById(id);
	}

}
