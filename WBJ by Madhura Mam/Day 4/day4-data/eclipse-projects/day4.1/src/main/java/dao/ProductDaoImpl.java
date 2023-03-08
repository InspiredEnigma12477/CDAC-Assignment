package dao;

import static utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Category;
import pojos.Product;

public class ProductDaoImpl implements ProductDao {

	@Override
	public String addProductToCategory(Long categoryId, Product newProduct) {
		String mesg = "adding product failed!!!!!!!!!";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// get category details from it's id
			Category category = session.get(Category.class, categoryId);
			if (category != null) {
				// establish bi dir asso
				category.addProduct(newProduct);
				// save product details
				session.persist(newProduct);
				mesg = "product added ID " + newProduct.getId();
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String removeProductFromCategory(Long categoryId, Long productId) {
		String mesg = "product removal failed !!!!";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			// get category from id
			Category category = session.get(Category.class, categoryId);
			// get product from it's id
			Product product = session.get(Product.class, productId);
			if (category != null && product != null) {
				// category n product : persistent
				// de link bi dir asso between Category n Product : add a method in POJO
				category.removeProduct(product);
				mesg = "product removed!";
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
