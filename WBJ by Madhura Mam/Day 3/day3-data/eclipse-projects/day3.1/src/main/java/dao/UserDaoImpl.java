package dao;

import pojos.Role;
import pojos.User;

import org.apache.commons.io.FileUtils;
import org.hibernate.*;
import static utils.HibernateUtils.getFactory;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

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
		System.out.println("is open " + session.isOpen() + " is connected " + session.isConnected());// t t

		try {
			// newUser : TRANSIENT
			// save : insert
			Integer id = (Integer) session.save(newUser);
			// newUser : PERSISTENT => it's a part of L1 cache,not part of DB yet
			tx.commit();// Hibernate perform auto dirty checking -->
			// session.flush() --> makes the changes from
			// L1 cache ---> DB -- DML : insert
			mesg = "User regd with ID=" + id;
			System.out.println("is open " + session.isOpen() + " is connected " + session.isConnected());// t t

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
		System.out.println("is open " + session.isOpen() + " is connected " + session.isConnected());// f f

		// newUser : DETACHED
		return mesg;
	}

	@Override
	public String saveUserDetailsViaGetCurrentSession(User newUser) {
		String mesg = "User reg failed !!!!!!!!!!!!";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. Begin a tx
		Transaction tx = session.beginTransaction();
		System.out.println("is open " + session.isOpen() + " is connected " + session.isConnected());// t t

		try {
			// newUser : TRANSIENT
			// save : insert
			// Integer id = (Integer) session.save(newUser);
			// session.persist(newUser);
			// session.saveOrUpdate(newUser);
			User persistentRef = (User) session.merge(newUser);
			System.out.println("new user id " + newUser.getUserId());//null : transient , not-null : detached
			System.out.println("persistent  user id " + persistentRef.getUserId());// not null
			// newUser : PERSISTENT => it's a part of L1 cache,not part of DB yet
			tx.commit();// Hibernate perform auto dirty checking -->
			// session.flush() --> makes the changes from
			// L1 cache ---> DB -- DML : insert
			mesg = "User regd with ID=" +persistentRef.getUserId();
		} catch (RuntimeException e) {
			// roll back Tx
			if (tx != null)
				tx.rollback();
			// re throw the exc to the caller
			throw e;
		}

		// newUser : DETACHED
		return mesg;
	}

	@Override
	public User getUserDetailsById(Integer id) {
		User user = null;// user : does not exist
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			// get user details
			user = session.get(User.class, id);// chks if user entity exists
			// in L1 cache --yes --rets the same , no ---select --user instance --added in
			// the L1 cache
			// rets the same
			user = session.get(User.class, id);
			user = session.get(User.class, id);
			// in case of valid id : user : PERSISTENT
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return user;// user : DETACHED
	}

	@Override
	public List<User> getAllUsers() {
		List<User> users = null;
		String jpql = "select u from User u";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			users = session.createQuery(jpql, User.class).getResultList();
			// users : list of persistent entities
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return users; // users : list of detached entities
	}

	@Override
	public List<User> getUsersByDateAndRole(LocalDate beginDate, LocalDate endDate, Role userRole) {
		List<User> users = null;
		String jpql = "select u from User u where u.regDate between :strt and :end and u.userRole=:rl";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			users = session.createQuery(jpql, User.class).setParameter("strt", beginDate).setParameter("end", endDate)
					.setParameter("rl", userRole).getResultList();

			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return users;
	}

	@Override
	public List<String> getUserFirstNamesByRole(Role userRole) {
		List<String> firstNames = null;
		String jpql = "select u.firstName from User u where u.userRole=:role";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			firstNames = session.createQuery(jpql, String.class).setParameter("role", userRole).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return firstNames;
	}

	@Override
	public List<User> getUserSomeDetailsByDateAndRole(LocalDate date1, Role userRole1) {
		List<User> users = null;
		String jpql = "select new pojos.User(lastName,regAmount,regDate) from User u where u.regDate>:date and u.userRole=:role";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			users = session.createQuery(jpql, User.class).setParameter("date", date1).setParameter("role", userRole1)
					.getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return users;
	}

	@Override
	public String changePassword(String email, String oldPwd, String newPwd) {
		String mesg = "Updation failed!!!!!!!!!!!!!!!";
		String jpql = "select u from User u where u.email=:em and u.password=:pass";
		User validUser = null;
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			validUser = session.createQuery(jpql, User.class).setParameter("em", email).setParameter("pass", oldPwd)
					.getSingleResult();
			// => valid login , validUser : persistent
			validUser.setPassword(newPwd);// modifying state persistent entity
			System.out.println("valid user ref exists "+session.contains(validUser));//true
		//evict
			session.evict(validUser);//validUser : DETACHED (cancelling the updates!)
			System.out.println("valid user ref exists "+session.contains(validUser));//false
			
			tx.commit();// hib perform auto dirty chking --session.flush --> DML : update --> session
						// closing
			mesg = "Updated password !";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		validUser.setPassword("123456789");// modifying state detached entity --> hib CAN NOT update the state of DB :
											// session is alrdy closed!
		return mesg;
	}// validUser : marked for GC

	@Override
	public String applyDiscount(LocalDate date, double amount) {
		String mesg = "Applying discount failed !!!!!!!!!!!";
		String jpql = "update User u set u.regAmount=u.regAmount-:discount where u.regDate<:dt";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			int updateCount = session.createQuery(jpql).setParameter("discount", amount).setParameter("dt", date)
					.executeUpdate();
			// L1 cache : EMPTY
			tx.commit();
			mesg = "Applied discount to " + updateCount + " users....";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String deleteUserDetails(Integer userId) {
		String mesg = "Details deletion failed !!!!";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			User user = session.get(User.class, userId);
			if (user != null) // => valid user : PERSISTENT
			{
				// user : persistent
				// mark the entity for removal
				session.delete(user);// user : REMOVED => neither removed from DB nor L1 cache
				mesg = "user details deleted!";
			}
			tx.commit();// Hibernate : auto dirty chking --session.flush() --> DML : delete -->
						// session.close()
			// --> L1 cache is destroyed , db cn rets to the cn pool
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String saveImageToDatabase(String email, String imageFilePath) throws IOException {
		String mesg = null;
		String jpql = "select u from User u where u.email=:em";
		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			User user = session.createQuery(jpql, User.class).setParameter("em", email).getSingleResult();
			// => no exc --valid user by email , user : Persistent
			// validate file path
			File file = new File(imageFilePath);
			if (file.isFile() && file.canRead()) {
				// => valid file
				user.setImage(FileUtils.readFileToByteArray(file));// modifying the satte of persistent entity
				mesg = "Saved image successfully...";
			} else
				mesg = "Invalid image path!!!!!!!!!!";
			tx.commit();// DML -- update
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String restoreImageFromDatabase(String email, String newImageFilePath) throws IOException {
		String mesg = "Restoring file failed!!!!!!";
		String jpql = "select u from User u where u.email=:em";

		// 1. get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			User user = session.createQuery(jpql, User.class).setParameter("em", email).getSingleResult();
			// => no exc --valid user by email , user : Persistent
			FileUtils.writeByteArrayToFile(new File(newImageFilePath), user.getImage());
			mesg = "Restored image from DB!";
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public User loadUserDetailsById(Integer id) {
		User user=null;
		// get session from SF
		Session session=getFactory().getCurrentSession();
		//begin a Tx
		Transaction tx=session.beginTransaction();
		try {
			user=session.load(User.class, id);
			//sesison : active
			//simply invoke any non id getter : Hint to hibernate
			user.getEmail();//select query
			tx.commit();
		} catch (RuntimeException e) {
			if(tx != null)
				tx.rollback();
			throw e;
		}
		System.out.println("user class "+user.getClass());
				
		return user;
	}
	

}
