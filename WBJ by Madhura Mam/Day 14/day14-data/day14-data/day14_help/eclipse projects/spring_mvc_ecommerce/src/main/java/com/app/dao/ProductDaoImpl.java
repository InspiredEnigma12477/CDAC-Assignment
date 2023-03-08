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
//import com.app.pojos.Product;
//
//@Repository
//@Transactional
//public class ProductDaoImpl implements ProductDao {
//	// dep : EntMgr
//	@Autowired
//	private EntityManager mgr;
//
//	@Override
//	public List<Product> getAllProductsByCategoryId(long categoryId) {
//		String jpql = "select p from Product p where p.productCategory.id=:id";
//		return mgr.createQuery(jpql, Product.class).setParameter("id", categoryId).getResultList();
//	}
//
//}
