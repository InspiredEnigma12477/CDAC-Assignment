package com.app.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojos.Employee;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
class TestEmployeeRepository {
	@Autowired
	private EmployeeRepository empRepo;

	@Test
	void test() {
		assertNotNull(empRepo);
	}

	// write a test case to insert 3 emp recs (saveAll)
	@Test
	void testAddMultipleEmps() {
		List<Employee> emps = List.of(
				new Employee("Rama", "Kher", "rama@gmail.com", "12345", "Pune", "RnD", LocalDate.of(2020, 10, 20),
						45678),
				new Employee("Anish", "Kher", "anish@gmail.com", "2345", "Mumbai", "Finance", LocalDate.of(2021, 1, 24),
						55678));
		List<Employee> savedEmps = empRepo.saveAll(emps);
		assertEquals(2, savedEmps.size());

	}

}
