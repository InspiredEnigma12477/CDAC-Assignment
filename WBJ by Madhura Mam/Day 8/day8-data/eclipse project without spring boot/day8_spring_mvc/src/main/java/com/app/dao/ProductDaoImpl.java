package com.app.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	//dep : SF
	@Autowired
	private SessionFactory sf;

	@Override
	public List<Product> getProductsByCategoryName(String categoryName1) {
		String jpql="select p from Product p where p.productCategory.categoryName=:nm";
		return sf.getCurrentSession().createQuery(jpql,Product.class).
				setParameter("nm", categoryName1).getResultList();
	}

}
