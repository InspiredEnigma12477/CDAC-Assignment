package com.app.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.app.pojos.Employee;

@DataJpaTest // scan only DAO layer spring beans
//to Tell Spring boot container NOT to replace actual data source(DB) by the test data base
@AutoConfigureTestDatabase(replace = Replace.NONE)
//To disable rollback : 
@Rollback(false) //NOT recommended !!!!!!!!!!!
class TestEmployeeRepository {
	@Autowired
	private EmployeeRepository empRepo;

	@Test
	void test() {
		assertNotNull(empRepo);
	}

	@Test
	void testAddEmployees() {
		List<Employee> emps = List.of(
				new Employee("Rama", "Kher", "rama@gmail.com", "12345", "Pune", LocalDate.of(2020, 10, 20), 45678),
				new Employee("Anish", "Kher", "anish@gmail.com", "2345", "Mumbai", LocalDate.of(2021, 1, 24), 55678));
		empRepo.saveAll(emps);
	}

}
