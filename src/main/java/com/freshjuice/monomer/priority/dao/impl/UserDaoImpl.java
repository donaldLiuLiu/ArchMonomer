package com.freshjuice.monomer.priority.dao.impl;

import com.freshjuice.monomer.priority.entity.User;
import org.springframework.stereotype.Repository;

import com.freshjuice.monomer.dao.FlBaseDao;
import com.freshjuice.monomer.priority.dao.IUserDao;

@Repository("userDao")
public class UserDaoImpl extends FlBaseDao implements IUserDao {

	@Override
	public String getPswdOfUserByUn(String principal) {
		return this.getSqlSession().selectOne("com.freshjuice.monomer.priority.dao.IUserDao.getPswdOfUserByUn", principal);
	}

	@Override
	public User getUserByUn(String username) {
		return this.getSqlSession().selectOne("com.freshjuice.monomer.priority.dao.IUserDao.getUserByUn", username);
	}

	@Override
	public User getUserByPhone(String phone) {
		return this.getSqlSession().selectOne("com.freshjuice.monomer.priority.dao.IUserDao.getUserByPhone", phone);
	}

	@Override
	public User getUserById(String id) {
		return this.getSqlSession().selectOne("com.freshjuice.monomer.priority.dao.IUserDao.getUserById", id);
	}

	@Override
	public void delUserById(String id) {
		this.getSqlSession().delete("com.freshjuice.monomer.priority.dao.IUserDao.delUserById", id);
	}

	@Override
	public void updateUser(User user) {
		this.getSqlSession().update("com.freshjuice.monomer.priority.dao.IUserDao.updateUser", user);
	}

}
