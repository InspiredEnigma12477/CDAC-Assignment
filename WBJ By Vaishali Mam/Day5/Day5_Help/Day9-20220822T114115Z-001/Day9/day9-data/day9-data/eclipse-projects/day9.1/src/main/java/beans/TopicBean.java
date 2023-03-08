package beans;

import java.sql.SQLException;
import java.util.List;

import dao.TopicDaoImpl;
import pojos.Topic;

public class TopicBean {
//dependency : Topic dao
	private TopicDaoImpl topicDao;
	public TopicBean() throws SQLException {
		// create topic dao instance
		topicDao=new TopicDaoImpl();
		System.out.println("topic bean created...");
	}
	//add B.L method to return all topics to the caller(JSP)
	public List<Topic> getAvailableTopics() throws SQLException
	{
		return topicDao.getAllTopics();
	}
	public TopicDaoImpl getTopicDao() {
		return topicDao;
	}
	
	

}
