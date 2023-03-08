package tester;

import static utils.HibernateUtils.getSf;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.TopicDaoImpl;
import dao.TutorialDaoImpl;
import pojos.Topic;
import pojos.Tutorial;

public class AddNewTutorial {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create tut dao instance
			TutorialDaoImpl dao=new TutorialDaoImpl();
			System.out.println("Enter tut details : title pub date(yr-mon-day)");
			String title=sc.next();
			LocalDate pubDate=LocalDate.parse(sc.next());
			sc.nextLine();
			System.out.println("Enter tut contents");
			String contents=sc.nextLine();
			Tutorial newTut=new Tutorial(title, pubDate, contents);
			System.out.println("Enter author id n topic id");
			System.out.println(dao.addNewTutorial(newTut,sc.nextInt(),sc.nextInt()));
			
		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
