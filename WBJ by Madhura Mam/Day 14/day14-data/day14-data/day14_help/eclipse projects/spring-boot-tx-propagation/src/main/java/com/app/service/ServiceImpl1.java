package com.app.service;

import com.app.dao.AuthorRepository;
import com.app.pojos.Author;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ServiceImpl1 implements IService1 {
	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private IService2 service2;

	@Transactional(propagation = Propagation.REQUIRED/* ,isolation = Isolation.SERIALIZABLE */)
	public void insertFirstAuthor() {

		Author author = new Author(35, "Chetan Bhagat", "Fiction");
		authorRepository.save(author);
		try {
			service2.insertSecondAuthor();
		} catch (RuntimeException e) {
			System.out.println("in err " + e);
		}
	}
}
