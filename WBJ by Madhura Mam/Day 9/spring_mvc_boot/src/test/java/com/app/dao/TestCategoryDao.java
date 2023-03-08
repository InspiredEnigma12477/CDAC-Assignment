package com.app.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//@DataJpaTest
//@AutoConfigureTestDatabase(replace = Replace.NONE)
@SpringBootTest
class TestCategoryDao {
	@Autowired
	private CategoryDao dao;

	@Test
	void testGetAllCategories() {
		dao.getAllCategories().forEach(System.out::println);
	}
	@Test
	void testGetCategoryById()
	{
		dao.getCategoryById(2l);
	}

}
