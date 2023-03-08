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
	}//service rets list of DETACHED categories to the caller(controller)

	@Override
	public String deleteCategory(Long categoryId) {
		// TODO Auto-generated method stub
		return categoryDao.deleteCategoryDetails(categoryId);
	}
	

}
