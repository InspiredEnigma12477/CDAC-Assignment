package com.app.dao;

import java.util.List;

import com.app.pojos.Category;

public interface CategoryDao {
//add a method to list all categories
	List<Category> getAllCategories();
	//add a method to delete a category
	String deleteCategoryDetails(Long categoryId);
}
