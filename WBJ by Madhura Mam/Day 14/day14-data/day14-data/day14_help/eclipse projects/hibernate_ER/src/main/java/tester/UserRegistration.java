package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.UserDaoImpl;
import pojos.User;

public class UserRegistration {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println("Enter user details : firstName,  lastName,  email,  password ");
			System.out.println(dao.registerUser(new User(sc.next(), sc.next(), sc.next(), sc.next())));

		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
