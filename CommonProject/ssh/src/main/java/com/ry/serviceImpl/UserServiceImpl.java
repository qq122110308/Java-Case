package com.ry.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ry.dao.UserDao;
import com.ry.pojo.User;
import com.ry.service.UserService;

/** 
* @author ry 
* @create2018年3月2日 下午2:13:44 
* @describe
*/
@Transactional
@Service
public class UserServiceImpl  implements UserService{
	
	@Autowired
	public UserDao userDao;
	
	@Override
	public int addUser(User user) {
		return userDao.addtUser(user);
	}

	@Override
	public int modify(User user) {
		return userDao.updateUser(user);
	}
	
}
 