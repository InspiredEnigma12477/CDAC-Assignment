package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.TutorialDaoImpl;

public class DisplayCompleteDetailsAllTuts {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create tut dao instance
			TutorialDaoImpl dao = new TutorialDaoImpl();
			dao.getCompleteDetails().forEach(t -> {
				System.out.println("Tut dtls "+t);
				System.out.println("Author "+t.getAuthor());
				System.out.println("Topic "+t.getTopic());
			});

		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
