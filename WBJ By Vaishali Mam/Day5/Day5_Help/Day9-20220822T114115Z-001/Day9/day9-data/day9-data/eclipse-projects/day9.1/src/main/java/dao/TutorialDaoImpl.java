package dao;

import static utils.DBUtils.getCn;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojos.Tutorial;

public class TutorialDaoImpl implements ITutorialDao {
	private Connection cn;
	private PreparedStatement pst1, pst2, pst3, pst4;

	public TutorialDaoImpl() throws SQLException {
		cn = getCn();
		pst1 = cn.prepareStatement("select name from tutorials where topic_id=? order by visits desc");
		pst2 = cn.prepareStatement("select * from tutorials where name=?");
		// update visits
		pst3 = cn.prepareStatement("update tutorials set visits=visits+1 where name=?");
		// add new tut
		pst4 = cn.prepareStatement("insert into tutorials values(default,?,?,?,?,?,?)");
		System.out.println("tut dao created...");
	}

	@Override
	public List<String> getAllTutorialNamesByTopic(int topicId) throws SQLException {
		List<String> tutNames = new ArrayList<>();
		// set IN param
		pst1.setInt(1, topicId);
		try (ResultSet rst = pst1.executeQuery()) {
			while (rst.next())
				tutNames.add(rst.getString(1));
		}
		return tutNames;
	}

	@Override
	public Tutorial getTutorialDetailsByName(String tutName) throws SQLException {
		// set IN param
		pst2.setString(1, tutName);
		try (ResultSet rst = pst2.executeQuery()) {
			if (rst.next())
				// int tutId, String tutName, String author, Date publishDate, int visits,
				// String contents,
				// int topicId
				return new Tutorial(rst.getInt(1), tutName, rst.getString(3), rst.getDate(4), rst.getInt(5),
						rst.getString(6), rst.getInt(7));
		}
		return null;
	}

	@Override
	public String updateVisits(String tutName) throws SQLException {
		// set IN param : tut name
		pst3.setString(1, tutName);
		int updateCount = pst3.executeUpdate();
		if (updateCount == 1)
			return "Visits updated....";
		return "updation failed!!!!!";
	}

	/*
	 * name | author | publish_date | visits | contents | topic_id
	 */
	@Override
	public String insertNewTutorial(Tutorial newTutorial) throws SQLException {
		// set IN params
		pst4.setString(1, newTutorial.getTutName());
		pst4.setString(2, newTutorial.getAuthor());
		pst4.setDate(3, newTutorial.getPublishDate());
		pst4.setInt(4, 0);//initing visits to 0
		pst4.setString(5, newTutorial.getContents());
		// FK : topic id
		pst4.setInt(6, newTutorial.getTopicId());
		int updateCount = pst4.executeUpdate();
		if (updateCount == 1)
			return "Inserted new tut.....";
		return "New tut insertion failed!!!!!!!!!!!!!!";
	}

	public void cleanUp() throws SQLException {
		if (pst1 != null)
			pst1.close();
		if (pst2 != null)
			pst2.close();
		if (pst3 != null)
			pst3.close();
		if (pst4 != null)
			pst4.close();
		System.out.println("tut dao cleaned up");

	}

}
