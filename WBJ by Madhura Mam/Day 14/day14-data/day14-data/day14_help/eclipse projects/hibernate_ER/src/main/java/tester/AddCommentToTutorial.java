package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CommentDaoImpl;
import pojos.Comment;

public class AddCommentToTutorial {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			CommentDaoImpl commentDao = new CommentDaoImpl();
			System.out.println("Enter tut id n customer id");
			long tutId = sc.nextLong();
			long custId = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter comment");
			System.out.println(commentDao.addComment(tutId, custId, new Comment(sc.nextLine())));

		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
