package dao;

import static utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.User;

public class UserDaoimpl implements UserDao {

	@Override
	public String registerUser(User newUser) {
		String mesg="user registration failed!!!!!!!!!!!";
		// get session from SF
		Session session = getFactory().getCurrentSession();
		// begin a Tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(newUser);//newUser : persistent
			tx.commit();//session.flush --> cascade --rec insertion
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
