package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.TopicDaoImpl;
import pojos.Topic;

public class AddNewTopic {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create topic dao instance
			TopicDaoImpl dao=new TopicDaoImpl();
			System.out.println("Enter topic name");
			System.out.println(dao.addNewTopic(new Topic(sc.nextLine())));
			
		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
