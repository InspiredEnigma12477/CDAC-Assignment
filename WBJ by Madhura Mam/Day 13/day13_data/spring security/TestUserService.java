package com.app.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.entities.Role;
import com.app.entities.UserEntity;

@SpringBootTest
class TestUserService {

	@Autowired
	private UserService userService;

	@Test
	void test() {
		assertNotNull(userService);
	}

	@Test
	public void testAddAdminDetails() {
		UserEntity admin = new UserEntity("Meera", "Seth", "meera@gmail.com", "xyz#1234", Role.ROLE_ADMIN);
		UserEntity entity = userService.addUserDetails(admin);
		assertEquals(1, entity.getId());

	}

	@Test
	public void testAddCustomerrDetails() {
		UserEntity customer = new UserEntity("Riya", "Kadam", "riya@gmail.com", "abc#1234", Role.ROLE_CUSTOMER);
		UserEntity entity = userService.addUserDetails(customer);
		assertEquals(2, entity.getId());

	}

}
