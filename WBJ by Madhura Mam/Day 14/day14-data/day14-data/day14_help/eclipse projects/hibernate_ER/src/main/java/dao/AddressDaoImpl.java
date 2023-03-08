package dao;

import static utils.HibernateUtils.getSf;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Address;
import pojos.User;

public class AddressDaoImpl implements IAddressDao {

	@Override
	public String assignUserAddress(long userId, Address adr) {
		String mesg = "assigning adr failed!!!!!!!!!!!!";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			// 1. get user details from user id
			User user = session.get(User.class, userId);
			// 2. chk if user exists
			if (user != null) {
				// => valid user id
				// establish uni dir link Address --> User
				adr.setOwner(user);
				session.persist(adr);
				mesg = "addr assigned to user with first name : " + user.getFirstName();
			}
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	/*
	 * get user details containing address details //why are we adding a method in
	 * adr dao ? It's uni dir relationship from Address --> User , that's why! Since
	 * using Shared PK concept in User n Address : userId is going to be SAME as
	 * address id //so it's user id OR addr id , one n the same !
	 */
	@Override
	public Address getUserAndAddressDetails(long userId) {
		Address adr = null;
		// since added FetchType.LAZY in Address entity , using join fetch , o.w it will
		// lift only address details n when u try to display user details , outside
		// session scope , LazyInitExc !
		// get session from SF
		String jpql = "select a from Address a join fetch a.owner where a.id=:id";
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			adr = session.createQuery(jpql, Address.class).setParameter("id", userId).getSingleResult();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return adr;
	}

	@Override
	public String updateAddress(long userId, String newCity, String newZipode) {
		String mesg="Address updation failed !!!!!!!!!";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			//get existing address for the user (Thanks to @MapsId : user id n adr id is the same)
			Address address=session.get(Address.class, userId);
			if(address != null)
			{
				address.setCity(newCity);
				address.setZipCode(newZipode);
				mesg="Address updated !!!!!";
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
