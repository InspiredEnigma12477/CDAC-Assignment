package com.app.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.User;

@SpringBootTest
class TestUserDao {
	@Autowired
	private UserDao dao;

	@Test
	void test() {
		assertNotNull(dao);
	}
	@Test
	void testAuthenticateUser()
	{
		User user = dao.authenticateUser("rama@gmail.com", "1234");
		assertEquals("Rama", user.getFirstName());
	}

}
