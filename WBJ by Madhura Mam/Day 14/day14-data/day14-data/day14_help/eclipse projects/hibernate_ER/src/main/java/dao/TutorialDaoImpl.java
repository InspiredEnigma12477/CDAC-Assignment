package dao;

import static utils.HibernateUtils.getSf;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Topic;
import pojos.Tutorial;
import pojos.User;

public class TutorialDaoImpl implements ITutorialDao {

	@Override
	public String addNewTutorial(Tutorial tutorial, long authorId, long topicId) {
		String mesg = "Adding new tut failed : invalid author or topic id !!!!!";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			// 1. get author(user) from it's id
			User author = session.get(User.class, authorId);
			// 2. get topic details from it's id
			Topic topic = session.get(Topic.class, topicId);
			if (author != null && topic != null) {
				// =>author n topic ids valid BUT the link is not yet established !
			//	System.out.println(tutorial.getAuthor() + " " + tutorial.getTopic());// null null
				// establish uni dir link from tut ---> topic
				tutorial.setTopic(topic);
				// establish uni dir link from tut ---> author
				tutorial.setAuthor(author);
				// tutorial : TRANSIENT
				session.persist(tutorial);
				mesg = "Added new tutorial with id " + tutorial.getId() + " authored by " + author.getLastName()
						+ " under a topic " + topic.getTopicName();
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
	public List<Tutorial> getAllTutorials() {
		List<Tutorial> tuts = null;
		String jpql = "select t from Tutorial t";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			tuts = session.createQuery(jpql, Tutorial.class).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return tuts;
	}

	@Override
	public List<Tutorial> getCompleteDetails() {
		List<Tutorial> tuts = null;
		String jpql = "select t from Tutorial t join fetch t.author join fetch t.topic";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			tuts = session.createQuery(jpql, Tutorial.class).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return tuts;
	}

	@Override
	public List<Tutorial> findByTopicName(String topicName) {
		List<Tutorial> tuts = null;
		// String jpql = "select t from Tutorial t where t.topic.topicName=:nm";
		// String jpql = "select t from Tutorial t join fetch t.topic tp where
		// tp.topicName=:nm";
		String jpql = "select t from Tutorial t join t.topic tp where tp.topicName=:nm";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			tuts = session.createQuery(jpql, Tutorial.class).setParameter("nm", topicName).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return tuts;
	}

	@Override
	public List<String> findByAuthorDate(String authorFirstName, String authorLastName, LocalDate date) {
		List<String> titles = null;
		String jpql = "select t.title from Tutorial t join t.author a where a.firstName=:fn and a.lastName=:ln and t.publishDate > :date";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			titles = session.createQuery(jpql, String.class).setParameter("fn", authorFirstName)
					.setParameter("ln", authorLastName).setParameter("date", date).getResultList();

			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return titles;
	}

	@Override
	public List<Tutorial> getTitleNDateByKeyword(String keyword) {
		List<Tutorial> tuts = null;
		String jpql = "select new pojos.Tutorial(title,publishDate) from Tutorial t where t.contents like :key";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			tuts = session.createQuery(jpql, Tutorial.class).setParameter("key", "%" + keyword + "%").getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return tuts;
	}

//Code below will produce Constraint violation exc : in case of child recs existing in comments table 
//	@Override
//	public String deleteTutorialContents(String title) {
//		String mesg="deletion failed !!!!!!!!!!!";
//		String deleteJpql="delete from Tutorial t where t.title=:title";
//		// get session from SF
//		Session session = getSf().getCurrentSession();
//		// begin tx
//		Transaction tx = session.beginTransaction();
//		try {
//			int count=session.createQuery(deleteJpql).setParameter("title", title).executeUpdate();
//			mesg="deleted "+count+" tutorial";					
//			tx.commit();
//		} catch (RuntimeException e) {
//			if (tx != null)
//				tx.rollback();
//			throw e;
//		}
//		return mesg;
//	}
	@Override
	public String deleteTutorialContents(String title) {
		String mesg = "deletion failed !!!!!!!!!!!";
		String jpql = "select t from Tutorial t join fetch t.comments where t.title=:title";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			Tutorial tutorial = session.createQuery(jpql, Tutorial.class).setParameter("title", title)
					.getSingleResult();
			//tutorial : PERSISTENT
			session.delete(tutorial);//tutorial : REMOVED
			tx.commit();
			mesg="Tutorial with ID "+tutorial.getId()+" deleted";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
