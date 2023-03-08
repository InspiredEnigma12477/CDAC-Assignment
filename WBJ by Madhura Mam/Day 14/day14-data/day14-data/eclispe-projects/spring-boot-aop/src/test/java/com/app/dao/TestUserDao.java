package com.app.dao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojos.Role;
import com.app.pojos.User;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class TestUserDao {
	@Autowired
	private UserDao userDao;

	/*
	 * this.firstName = firstName; this.lastName = lastName; this.email = email;
	 * this.password = password; this.role = role; this.regDate = regDate;
	 * this.regAmount = regAmount; this.description = description;
	 */
	@Test
	void testAddUsers() {
		List<User> list = List.of(new User("Rama", "Kher", "rama@gmail.com", "abc#1234", Role.ROLE_ADMIN, LocalDate.of(2020, 10, 20),
				1000, "admin desc"),
				new User("Mihir", "Rao", "mihir@gmail.com", "xyz#1234", Role.ROLE_CUSTOMER, LocalDate.of(2021, 1, 20),
						2000, "customer desc"));
		List<User> list2 = userDao.saveAll(list);
		assertEquals(2, list2.size());
	}

}
