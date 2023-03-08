package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.TopicDaoImpl;

public class FindTopicsByTutorialAuthor {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create topic dao instance
			TopicDaoImpl topicDao = new TopicDaoImpl();
			System.out.println("To find the topics of tutorials published by author : Enter first  name of the author");
			String fn = sc.next();
			System.out.println("Author " + fn + " has published tutorials under these topics : ");
			topicDao.getTopicsByTutorialAuthor(fn).forEach(System.out::println);
		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
