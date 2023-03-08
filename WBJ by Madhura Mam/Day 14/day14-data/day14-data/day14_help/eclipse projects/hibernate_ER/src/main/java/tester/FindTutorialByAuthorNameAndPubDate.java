package tester;

import static utils.HibernateUtils.getSf;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.TutorialDaoImpl;

public class FindTutorialByAuthorNameAndPubDate {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create tut dao instance
			TutorialDaoImpl dao = new TutorialDaoImpl();
			System.out.println("Enter Author's first name , last name n publish date(yr-mon-day)");
			dao.findByAuthorDate(sc.next(), sc.next(), LocalDate.parse(sc.next()))
			.forEach(System.out::println);

		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
