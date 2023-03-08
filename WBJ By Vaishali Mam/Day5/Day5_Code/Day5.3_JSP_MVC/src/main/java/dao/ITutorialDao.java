package dao;

import java.sql.SQLException;
import java.util.List;

import pojos.Tutorial;

public interface ITutorialDao {
	List<String> getAllTutorialNamesByTopic(int topicId) throws SQLException;
	Tutorial getTutorialDetailsByName(String tutName) throws SQLException;
	//add a method to update visits by customer
	String updateVisits(String tutName) throws SQLException;
}
