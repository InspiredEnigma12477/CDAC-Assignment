package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class DepartmentDaoImpl implements DepartmentDao {
	//dep : JPA's EntityManager
	@Autowired //OR JPA's @PersistenceContext
	private EntityManager mgr;

	@Override
	public List<String> getDeptNames() {
		String jpql="select d.deptName from Department d";
		return mgr.createQuery(jpql,String.class).getResultList();
	}

}
