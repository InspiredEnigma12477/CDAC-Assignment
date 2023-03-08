package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.TutorialDaoImpl;

public class GetTutDetailsByKeywordInContents {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create tut dao instance
			TutorialDaoImpl dao = new TutorialDaoImpl();
			System.out.println("Enter keyword for searching in tutorial contents");
			String searchKey=sc.next();
			System.out.println("Listing tuts name n date which contains search key "+searchKey+" in it's contents");
			dao.getTitleNDateByKeyword(searchKey).
			forEach(t -> System.out.println(t.getTitle()+" Published on "+t.getPublishDate()));
			

		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
