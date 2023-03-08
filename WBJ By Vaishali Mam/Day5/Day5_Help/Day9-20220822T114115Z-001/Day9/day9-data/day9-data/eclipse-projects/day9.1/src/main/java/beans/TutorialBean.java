package beans;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;

import dao.TutorialDaoImpl;
import pojos.Tutorial;

/*
 * http://localhost:8080/day9.1/process_form.jsp?topicId=2&tutName=JSP+EL+Syntax&author=Raj
 * &pubDate=2022-03-03&contents=EL+syntax+is+a+powerful+replacement+of+JSP+Exprs.....
 */
public class TutorialBean {
	// dependency : tut dao
	private TutorialDaoImpl tutDao;
	private int topicId;
	private String tutName;
	private String author;
	private String pubDate;
	private String contents;
	private String message;
	public TutorialBean() throws SQLException{
		//tut dao instance
		tutDao=new TutorialDaoImpl();
		System.out.println("tut bean created ....");
	}
	public TutorialDaoImpl getTutDao() {
		return tutDao;
	}
	public void setTutDao(TutorialDaoImpl tutDao) {
		this.tutDao = tutDao;
	}
	public int getTopicId() {
		return topicId;
	}
	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}
	public String getTutName() {
		return tutName;
	}
	public void setTutName(String tutName) {
		this.tutName = tutName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPubDate() {
		return pubDate;
	}
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	
	public String getMessage() {
		return message;
	}
	
	//add B.L method for validation + insertion of new tutorial
	public String validateNInsertNewTutorial() throws SQLException
	{
		//parse pub date into a LocalDate
		LocalDate publishDate=LocalDate.parse(pubDate);
		long periodInMonths=Period.between(publishDate, LocalDate.now()).toTotalMonths();
		if(contents.length()> 255 || periodInMonths > 6)
		{
			//validation err ---navigate clnt to the form again
			message="Validation failure : contents or pub date invalid !!!!!!!!!!!";
			return "add_new_tut";
		}
		//validation success --insert tut contents in to db table.
		//bean --> dao's method
		//String tutName, String author, Date publishDate,  String contents, int topicId
		message=tutDao.insertNewTutorial(new Tutorial(tutName, author, Date.valueOf(publishDate),contents, topicId));		
		return "admin";
	}
}
