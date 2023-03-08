package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.AuthorRepository;
import com.app.pojos.Author;

@Service
public class ServiceImpl2 implements IService2{
	@Autowired
	private AuthorRepository authorRepository;

	@Transactional//(propagation = Propagation.NEVER)
	public void insertSecondAuthor() {
		Author author = new Author(70, "Ayn Rand", "Philosophy");
		authorRepository.save(author);
		throw new RuntimeException("DummyException: What should happen?");

	}
}
