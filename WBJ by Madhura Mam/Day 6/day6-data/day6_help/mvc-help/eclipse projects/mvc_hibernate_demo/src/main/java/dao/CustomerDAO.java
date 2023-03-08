package dao;

import static utils.HibernateUtils.getFactory;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Customer;

public class CustomerDAO {
	public Customer validateCustomer(String email, String pass) throws Exception {
		Customer c = null;
		Session sess = getFactory().getCurrentSession();
		// tx
		Transaction tx = sess.beginTransaction();
		try {
			c = (Customer) sess
					.createQuery("select c from Customer c where c.email = :em and c.password = :pa", Customer.class)
					.setParameter("em", email).setParameter("pa", pass).getSingleResult();
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		System.out.println("dao " + c);
		return c;// detached pojo
	}
}
