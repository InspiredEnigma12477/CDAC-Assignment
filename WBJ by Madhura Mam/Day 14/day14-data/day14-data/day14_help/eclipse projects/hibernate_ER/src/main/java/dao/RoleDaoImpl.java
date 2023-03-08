package dao;

import static utils.HibernateUtils.getSf;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Role;
import pojos.UserRole;

public class RoleDaoImpl implements IRoleDao {

	@Override
	public String addRole(Role role) {
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(role);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return "New Role added with id :" + role.getId();
	}

	@Override
	public Role findByRoleName(UserRole roleName) {
		Role role = null;
		String jpql = "select r from Role r where r.roleName=:nm";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			role = session.createQuery(jpql, Role.class).setParameter("nm", roleName).getSingleResult();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return role;
	}

	
	

}
