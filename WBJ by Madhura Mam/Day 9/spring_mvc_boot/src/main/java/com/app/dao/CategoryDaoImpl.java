package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Category;

@Repository
public class CategoryDaoImpl implements CategoryDao {
	// dep : EntMgr
	@Autowired // autowire=byType : Field level D.I
	private EntityManager mgr;

	@Override
	public List<Category> getAllCategories() {
		String jpql = "select c from Category c";
		return mgr.createQuery(jpql, Category.class).getResultList();
	}// DAO rets List of PERSISTENT categories to the caller(service)

	@Override
	public String deleteCategoryDetails(Category category) {
		String mesg = "Deleted category n asso products if any !";
		mgr.remove(category);// category : REMOVED		
		return mesg;
	}

	@Override
	public Category getCategoryById(Long categoryId) {
		// get category details from it's id
		Category category = mgr.find(Category.class, categoryId);
		return category;
	}
	@Override
	public String updateCategoryDetails(Category category) {
		Category persistentCategory = mgr.merge(category);
		return "Category updated....";
	}

	@Override
	public String addCategoryDetails(Category category) {
		mgr.persist(category);
		return "New Category added with id "+category.getId();
	}
	

}
