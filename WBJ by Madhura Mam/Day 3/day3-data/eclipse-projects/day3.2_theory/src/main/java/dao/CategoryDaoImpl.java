package dao;

import static utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Category;

public class CategoryDaoImpl implements CategoryDao {

	@Override
	public String addNewCategory(Category newCategory) {
		String mesg = "Adding category failed";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(newCategory);
			tx.commit();
			mesg = "New category added with ID " + newCategory.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
