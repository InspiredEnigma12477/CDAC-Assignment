package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.UserDao;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	// dep : dao layer i/f
	@Autowired
	private UserDao userDao;

	@Override
	public User validateUser(String email, String password) {
		// TODO Auto-generated method stub
		return userDao.authenticateUser(email, password);
	}// transaction method rets --> Tx mgr chks for un chked(Runtime exc) exc --
		// yes ---L1 cache destroyed n pooled out db cn rets to the pool
		// no -- auto dirty chking -> session.flush --> DMLs if needed ---L1 cache
		// destroyed n pooled out db cn rets to the pool
	//in case of successful login service layer rets --> detached user obj --> to the caller

}
