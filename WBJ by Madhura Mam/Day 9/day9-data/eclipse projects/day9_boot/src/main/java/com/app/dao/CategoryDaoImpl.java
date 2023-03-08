package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Category;
@Repository
public class CategoryDaoImpl implements CategoryDao {
	//dep : EntMgr
	@Autowired//autowire=byType : Field level D.I
	private EntityManager mgr;

	@Override
	public List<Category> getAllCategories() {
		String jpql="select c from Category c";
		return mgr.createQuery(jpql, Category.class).getResultList();
	}//DAO rets List of PERSISTENT categories to the caller(service)

	@Override
	public String deleteCategoryDetails(Long categoryId) {
		String mesg="Deleting Category Failed ";
		//get category details from it's id
		Category category=mgr.find(Category.class, categoryId);
		if(category != null) {
			mgr.remove(category);
			mesg="Deleted category n asso products if any !";
		}
		return mesg;
	}
	

}
