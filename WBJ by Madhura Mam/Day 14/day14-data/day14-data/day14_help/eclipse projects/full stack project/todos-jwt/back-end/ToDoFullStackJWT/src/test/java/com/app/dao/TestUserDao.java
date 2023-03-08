package com.app.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.service.IToDoService;

@SpringBootTest
class TestUserDao {
	@Autowired
	private UserRepository userRepo;

	@Autowired
	private ToDoRepository todoRepo;
	
	@Autowired
	private IToDoService service;

	@Test
	void testFindAllUsers() {
		userRepo.findAll().forEach(u -> System.out.println(u.getUserName() + " " + u.getRoles()));
	}

	@Test
	void testFindByUserUserName() {
		todoRepo.findByUserUserName("Riya").forEach(
				t -> System.out.println(t.getDesc() + " " + t.getUser().getUserName() + " " + t.getUser().getRoles()));
	}
	@Test
	void testFindByUserUserNameService() {
		service.getTodos("Riya").forEach(
				t -> System.out.println(t.getDesc() + " " + t.getUser().getUserName() + " " + t.getUser().getRoles()));
	}
	@Test
	void testFindByDescContaining()
	{
		todoRepo.findByDescContaining("do").forEach(t -> System.out.println(t.getDesc()));
	}
	
	@Test
	void testFetchToDoDesc()
	{
		todoRepo.fetchToDoDesc("do 1").forEach(desc -> System.out.println(desc));
	}
	

}
