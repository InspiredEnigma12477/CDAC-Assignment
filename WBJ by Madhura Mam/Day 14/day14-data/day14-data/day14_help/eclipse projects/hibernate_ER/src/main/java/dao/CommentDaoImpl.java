package dao;

import static utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Comment;
import pojos.Role;
import pojos.Tutorial;
import pojos.User;
import pojos.UserRole;

public class CommentDaoImpl implements ICommentDao {

	@Override
	public String addComment(long tutId, long userId, Comment c) {
		String mesg = "Adding comment failed !!!!!!!!";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			// get tut from it's id
			Tutorial tut = session.get(Tutorial.class, tutId);
			// get user form user id
			User user = session.get(User.class, userId);// Since using FetchType as eager in User --- Role , this will
														// lift the user as well as user_roles details , in a single joi query
			if (tut != null && user != null && user.getRoles().contains(new Role(UserRole.CUSTOMER))) {
				// establish relationship between Comment n user
				c.setCustomer(user);
				// establish relationship between Comment n Tutorial
				c.setTutorial(tut);
				session.persist(c);
				mesg = "Added comment!";
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
