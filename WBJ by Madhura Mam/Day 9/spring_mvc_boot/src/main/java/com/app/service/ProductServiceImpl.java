package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ProductDao;
import com.app.pojos.Product;
@Service //=> spring bean containing B.L
@Transactional //to auto. manage transactions
public class ProductServiceImpl implements ProductService {
	//dep : dao layer i/f
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getProductsByCategoryName(String categoryName) {
		// TODO Auto-generated method stub
		return productDao.getProductsByCategoryName(categoryName);
	}

}
