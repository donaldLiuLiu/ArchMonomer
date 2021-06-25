package com.freshjuice.monomer.priority.dao.impl;

import java.util.List;

import com.freshjuice.monomer.priority.dao.IResourceDao;
import org.springframework.stereotype.Repository;

import com.freshjuice.monomer.dao.FlBaseDao;
import com.freshjuice.monomer.priority.entity.PriorityResource;

@Repository("resourceDao")
public class ResourceDaoImpl extends FlBaseDao implements IResourceDao {

	@Override
	public String getFAuthOfPath(String path) {
		return this.getSqlSession().selectOne("com.freshjuice.monomer.priority.dao.IResourceDao.getFAuthOfPath", path);
	}

	@Override
	public List<String> getPermissionsOfUserByUn(String pricipal) {
		return this.getSqlSession().selectList("com.freshjuice.monomer.priority.dao.IResourceDao.getPermissionsOfUserByUn", pricipal);
	}

	@Override
	public PriorityResource getResourceOfPath(String pathWithinApplication) {
		return this.getSqlSession().selectOne("com.freshjuice.monomer.priority.dao.IResourceDao.getResourceOfPath", pathWithinApplication);
	}

}
