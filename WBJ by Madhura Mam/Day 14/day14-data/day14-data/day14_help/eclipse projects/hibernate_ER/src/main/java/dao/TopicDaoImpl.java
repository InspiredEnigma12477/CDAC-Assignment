package dao;

import static utils.HibernateUtils.getSf;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Topic;

public class TopicDaoImpl implements ITopicDao {

	@Override
	public String addNewTopic(Topic topic) {
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(topic);
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return "New Topic Added with ID " + topic.getId();
	}

	@Override
	public List<Topic> getTopicsByTutorialAuthor(String firstName) {
		List<Topic> topics = null;
		String jpql = "select distinct t.topic from Tutorial t join t.author a where a.firstName=:fn";
		// get session from SF
		Session session = getSf().getCurrentSession();
		// begin tx
		Transaction tx = session.beginTransaction();
		try {
			topics = session.createQuery(jpql, Topic.class).setParameter("fn", firstName).getResultList();
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return topics;
	}

}
