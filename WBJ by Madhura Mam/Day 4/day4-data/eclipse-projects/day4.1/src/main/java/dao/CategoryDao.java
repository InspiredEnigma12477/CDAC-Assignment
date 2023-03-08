package dao;

import pojos.Category;

public interface CategoryDao {
//1. Add a new category
	String addNewCategory(Category newCategory);
	//remove a category
	String removeCategory(String categoryName);
	//display category details
	Category getDetails(String categoryName);
	//display category n product details
	Category getCategoryAndProductDetails(String categoryName);
}
