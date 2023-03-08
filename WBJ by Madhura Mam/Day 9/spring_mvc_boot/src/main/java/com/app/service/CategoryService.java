package com.app.service;

import java.util.List;

import com.app.pojos.Category;

public interface CategoryService {
	//add a method to list all categories
		List<Category> fetchAllCategories();
		//delete a category
		String deleteCategory(Long categoryId);
		//update category
		String updateCategory(Long categoryId,Category category);
		//update category
		String addCategory(Category category);
		// add a method to get category details by id
		Category getCategoryById(Long categoryId);
}
