package com.ry.daoImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import com.ry.dao.UserDao;
import com.ry.pojo.User;

/** 
* @author ry 
* @create2018年3月2日 下午2:13:18 
* @describe
*/
public class UserDaoImpl extends HibernateDaoSupport  implements UserDao{
	
	@Autowired
	protected HibernateTemplate hibernateTemplate;
	
	@Override
	public int addtUser(User user) {
		hibernateTemplate.save(user);
		return 1;
	}

	@Override
	public int updateUser(User user) {
		hibernateTemplate.saveOrUpdate(user);
		return 1;
	}

}
 