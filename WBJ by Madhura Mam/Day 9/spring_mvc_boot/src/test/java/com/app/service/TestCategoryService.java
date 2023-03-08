package com.app.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.app.pojos.Category;

@SpringBootTest
class TestCategoryService {
	@Autowired
	private CategoryService service;

	@Test
	void testAddCategory() {
		String mesg = service.addCategory(new Category("Technical Books", "Latest Trending Books"));
		System.out.println(mesg);
		assertEquals(true, mesg.contains("5"));
				
	}
	@Test
	void testUpdateCategory()
	{
		Category updateCat=new Category("Technical Valuable Books11", "Latest Important Trending Books2 ");
		updateCat.setId(5l);
		System.out.println(service.updateCategory(5l,updateCat));
	}
	@Test
	void testGetCategory()
	{
		Category category=service.getCategoryById(5l);
		System.out.println(category);
	}
	@Test
	void testDeleteCategory()
	{
		System.out.println(service.deleteCategory(5l));
		
	}

}
