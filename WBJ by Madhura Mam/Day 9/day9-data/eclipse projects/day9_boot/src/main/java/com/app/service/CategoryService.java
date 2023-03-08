package com.app.service;

import java.util.List;

import com.app.pojos.Category;

public interface CategoryService {
	//add a method to list all categories
		List<Category> fetchAllCategories();
		//del a category
		String deleteCategory(Long categoryId);
}
