package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.TutorialDaoImpl;

public class DeleteTutorialContents {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create tut dao instance
			TutorialDaoImpl dao = new TutorialDaoImpl();
			System.out.println("Enter title of the tutorial to delete");
			System.out.println(dao.deleteTutorialContents(sc.next()));

		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
