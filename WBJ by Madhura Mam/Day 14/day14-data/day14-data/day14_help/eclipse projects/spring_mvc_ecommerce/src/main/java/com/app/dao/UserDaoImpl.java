//package com.app.dao;
//
//import javax.persistence.EntityManager;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.app.pojos.User;
//
//@Repository // Mandatory annotation to tell SC : following is a spring bean : DAO layer
////singleton n eager
//public class UserDaoImpl implements UserDao {
//	// dependency : EntityManager
//	@Autowired // autowire=byType 
//	//OR JPA @PersistenceContext
//	private EntityManager manager;
//
//	@Override
//	public User validateUser(String email, String pass) {
//		String jpql="select u from User u where u.email=:em and u.password=:pass";
//		return manager.
//				createQuery(jpql, User.class).
//				setParameter("em", email).
//				setParameter("pass", pass).
//				getSingleResult();
//	}
//
//}
