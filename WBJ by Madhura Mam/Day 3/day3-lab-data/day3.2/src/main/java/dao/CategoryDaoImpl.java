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

	@Override
	public String removeCategory(String categoryName) {
		String mesg="category removal failed!!!!!!!!!";
		String jpql = "select c from Category c where c.categoryName=:nm";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			Category category = session.createQuery(jpql, Category.class)
					.setParameter("nm", categoryName)
					.getSingleResult();
			//category : persistent
			session.delete(category);// marks the category obj for removal
			tx.commit();// cascades delete operation to child table --
			//deletes products --then deletes parent  rec.
			mesg="category removed....";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return null;
	}

	// un comment this to check : FK constraint violation exception

//	@Override
//	public String removeCategory(String categoryName) {
//		String mesg="category removal failed!!!!!!!!!";
//		String jpql = "delete from Category c where c.categoryName=:nm";
//		// get session from SF
//		Session session = getFactory().getCurrentSession();
//		// begin a Tx
//		Transaction tx = session.beginTransaction();
//		try {
//			int updateCount = session.createQuery(jpql)
//					.setParameter("nm", categoryName).executeUpdate();
//			tx.commit();
//			mesg="category removed....rec count "+updateCount;
//		} catch (RuntimeException e) {
//			if (tx != null)
//				tx.rollback();
//			throw e;
//		}
//		return mesg;
//	}

}
