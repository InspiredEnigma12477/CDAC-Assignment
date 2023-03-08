package dao;

import pojos.User;
import org.hibernate.*;
import static utils.HibernateUtils.getFactory;

public class UserDaoImpl implements UserDao {

	@Override
	public String saveUserDetails(User newUser) {
		String mesg = "User reg failed !!!!!!!!!!!!";
		// 1. get session from SF
		Session session = getFactory().openSession();
		Session session2 = getFactory().openSession();
		System.out.println(session == session2);// false
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		System.out.println("is open " + session.isOpen() 
		+ " is connected " + session.isConnected());//t t

		try {
			// newUser : TRANSIENT
			// save : insert
			Integer id = (Integer) session.save(newUser);
			// newUser : PERSISTENT => it's a part of L1 cache,not part of DB yet
			tx.commit();// Hibernate perform auto dirty checking -->
			// session.flush() --> makes the changes from
			// L1 cache ---> DB -- DML : insert
			mesg = "User regd with ID=" + id;
			System.out.println("is open " + session.isOpen() 
			+ " is connected " + session.isConnected());//t t


		} catch (RuntimeException e) {
			// roll back Tx
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		} finally {
			// close session
			if (session != null)
				session.close();// pooled out DB cn rets to
			// the pool n L1 cache is destroyed!
		}
		System.out.println("is open " + session.isOpen() 
		+ " is connected " + session.isConnected());//f f

		// newUser : DETACHED
		return mesg;
	}
	@Override
	public String saveUserDetailsViaGetCurrentSession(User newUser) {
		String mesg = "User reg failed !!!!!!!!!!!!";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		Session session2 = getFactory().getCurrentSession();
		System.out.println(session == session2);// true
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		System.out.println("is open " + session.isOpen() 
		+ " is connected " + session.isConnected());//t t

		try {
			// newUser : TRANSIENT
			// save : insert
			Integer id = (Integer) session.save(newUser);
			// newUser : PERSISTENT => it's a part of L1 cache,not part of DB yet
			tx.commit();// Hibernate perform auto dirty checking -->
			// session.flush() --> makes the changes from
			// L1 cache ---> DB -- DML : insert
			mesg = "User regd with ID=" + id;
			System.out.println("is open " + session.isOpen() 
			+ " is connected " + session.isConnected());//f f


		} catch (RuntimeException e) {
			// roll back Tx
			if (tx != null)
				tx.rollback();
			System.out.println("is open " + session.isOpen() 
			+ " is connected " + session.isConnected());//f f

			// re throw the exc to the caller
			throw e;
		} 
		
		// newUser : DETACHED
		return mesg;
	}

	

}
