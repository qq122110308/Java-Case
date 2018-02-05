package com.ry.service;

import org.springframework.stereotype.Service;

import com.ry.Entity.Users;

/** 
* @author ry 
* @create2018年2月1日 上午9:53:52 
* @describe
*/



public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(Users record);

    int insertSelective(Users record);

    Users selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);	
    
    
    String testEhcache(String param);
}
 