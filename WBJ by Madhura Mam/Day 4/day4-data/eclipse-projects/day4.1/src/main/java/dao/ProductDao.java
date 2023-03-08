package dao;

import pojos.Product;

public interface ProductDao {
//Add Product to the category
	String addProductToCategory(Long categoryId,Product newProduct);
	//Remove a product from a Category
	String removeProductFromCategory(Long categoryId,Long productId);

}
