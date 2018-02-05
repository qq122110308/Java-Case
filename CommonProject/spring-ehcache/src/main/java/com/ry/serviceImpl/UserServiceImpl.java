package com.ry.serviceImpl;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.ry.Entity.Users;
import com.ry.dao.UsersMapper;
import com.ry.service.UserService;

/** 
* @author ry 
* @create2018年2月1日 上午9:54:44 
* @describe
*/
@Service
public class UserServiceImpl implements UserService{
    
	
	//注入service依赖
	@Autowired
	private UsersMapper usersMapper;
	
	
	@Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return usersMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Users record) {
		// TODO Auto-generated method stub
		return usersMapper.insert(record);
	}

	@Override
	public int insertSelective(Users record) {
		// TODO Auto-generated method stub
		return usersMapper.insertSelective(record);
	}

	@Override
	@Cacheable(value="cacheTest")
	public Users selectByPrimaryKey(Integer id) {
		
		long timestamp = System.currentTimeMillis();
		System.out.println("timestamp ="+timestamp);
		
		return usersMapper.selectByPrimaryKey(id);
	}
	
	//@Transactional
	/**
	 * 使用注解控制事务方法的优点： 1.开发团队达成一致约定，明确标注事务方法的编程风格
	 * 2.保证事务方法的执行时间尽可能短，不要穿插其他网络操作，RPC/HTTP请求或者剥离到事务方法外部
	 * 3.不是所有的方法都需要事务，如只有一条修改操作，只读操作不需要事务控制
	 */
	@Override
	public int updateByPrimaryKeySelective(Users record) {
		// TODO Auto-generated method stub
		return usersMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Users record) {
		// TODO Auto-generated method stub
		return usersMapper.updateByPrimaryKey(record);
	}

	@Override
	@Cacheable(value="cacheTest")
	public String testEhcache(String param) {
		long timestamp = System.currentTimeMillis();
		
		return String.valueOf(timestamp);
	}
	
}
 