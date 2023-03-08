package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.CategoryDao;
import com.app.pojos.Category;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {
//dep : dao layer i/f
	@Autowired
	private CategoryDao categoryDao;

	@Override
	public List<Category> fetchAllCategories() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategories();
	}// service rets list of DETACHED categories to the caller(controller)

	@Override
	public String deleteCategory(Long categoryId) {
		// validate category id --if it exists
		Category category = categoryDao.getCategoryById(categoryId);
		if (category != null)
			return categoryDao.deleteCategoryDetails(category);
		return "Category Deletion Failed : Invalid Category id !!!!!!!!!!!";
	}// @Transactional method rets --> tx boundary --chks for runtime exc --NO
		// --tx.commit --auto dirty chking --sesison.flush --> DML : delete , session
		// closed --L1 cache destroyed , db cn rets to the DB CP

	@Override
	public String updateCategory(Long categoryId,Category category) {
		Category category1 = categoryDao.getCategoryById(categoryId);
		if (category1 != null)
			return categoryDao.updateCategoryDetails(category);
		return "Category Updation Failed : Invalid Category id !!!!!!!!!!!";
	}

	@Override
	public String addCategory(Category category) {
		// TODO Auto-generated method stub
		return categoryDao.addCategoryDetails(category);
	}

	@Override
	public Category getCategoryById(Long categoryId) {
		// TODO Auto-generated method stub
		return categoryDao.getCategoryById(categoryId);
	}
	
	
}
