package com.app;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.app.dao.ToDoRepository;

@SpringBootTest
class ApplicationTests {
	@Autowired
	private PasswordEncoder enc;
	
	@Autowired
	private ToDoRepository todoRepo;

	@Test
	void contextLoads() {
		System.out.println(enc.encode("ram#12345"));
	System.out.println(enc.encode("1234"));
	
	}
	@Test
	void testFindByUserUserName() {
		todoRepo.findByUserUserName("Riya").forEach(System.out::println);
	
	}

}
