package dao;

import java.util.List;

import pojos.Topic;

public interface ITopicDao {
	/*
	 * Add new topic User i/p : topic details
	 */
	String addNewTopic(Topic topic);

	// get all topics containing tutorials authored by specific author's first name
	List<Topic> getTopicsByTutorialAuthor(String firstName);
}
