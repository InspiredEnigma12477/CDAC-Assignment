package com.app.dao;

import java.util.List;

import com.app.pojos.Category;

public interface CategoryDao {
//add a method to list all categories
	List<Category> getAllCategories();

	// add a method to get category details by id
	Category getCategoryById(Long categoryId);

	// add a method to delete a category
	String deleteCategoryDetails(Category category);

	// add a method to update a category
	String updateCategoryDetails(Category category);
	//add new category
	String addCategoryDetails(Category category);
}
