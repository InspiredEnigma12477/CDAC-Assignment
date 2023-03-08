package dao;

import java.time.LocalDate;
import java.util.List;

import pojos.Tutorial;

public interface ITutorialDao {
	/*
	 * Add tut by author under existing topic User i/p : tut details , auth id ,
	 * topic id
	 */
	String addNewTutorial(Tutorial tutorial, long authorId, long topicId);

	// get only tutorial details : only tut details
	List<Tutorial> getAllTutorials();

	// get complete tutorial details : including tut , author , topic
	List<Tutorial> getCompleteDetails();

	// Search tutorials by topic name
	List<Tutorial> findByTopicName(String topicName);

	// get all tutorial titles written by specified author , published after
	// specific date
	List<String> findByAuthorDate(String authorFirstName, String authorLastName, LocalDate date);

	// Display all title n publish date of all the tutorials whose contents contain
	// specific keyword
	List<Tutorial> getTitleNDateByKeyword(String keyword);
	
	//delete tutorial contents :allowed only for admin
	String  deleteTutorialContents(String title);

}
