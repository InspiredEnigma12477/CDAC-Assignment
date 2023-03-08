//package com.app.dao;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.app.pojos.Category;
//
//@Repository
//@Transactional //since service layer is going to be skipped , add it on dao layer
//public class CategoryDaoImpl implements CategoryDao {
//	//dep : JPA's EntityManager
//	@Autowired
//	private EntityManager manager;
//
//	@Override
//	public List<Category> getAllCategories() {
//		String jpql="select c from Category c";
//		return manager.createQuery(jpql, Category.class).getResultList();
//	}//tx over 
//
//}
