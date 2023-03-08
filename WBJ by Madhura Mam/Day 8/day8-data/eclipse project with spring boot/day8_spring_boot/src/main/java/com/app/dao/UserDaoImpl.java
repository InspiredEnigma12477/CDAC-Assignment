package com.app.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.User;

@Repository
public class UserDaoImpl implements UserDao {
	// dep : JPA : EntityMgr
	@Autowired
	private EntityManager mgr;

	@Override
	public User authenticateUser(String email, String pwd) {
		String jpql = "select u from User u where u.email=:em and u.password=:pass";
		return mgr.createQuery(jpql,User.class).
				setParameter("em",email)
				.setParameter("pass", pwd)
				.getSingleResult();
	}

}
