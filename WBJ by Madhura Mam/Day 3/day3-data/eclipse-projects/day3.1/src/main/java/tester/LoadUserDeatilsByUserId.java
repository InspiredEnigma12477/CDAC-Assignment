package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.UserDaoImpl;
import pojos.Role;
import pojos.User;

public class LoadUserDeatilsByUserId {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			UserDaoImpl userDao = new UserDaoImpl();
			System.out.println("Enter user id");
			System.out.println(userDao.loadUserDetailsById(sc.nextInt()));
		} // JVM : sc.close , sf.close() => DB cn pool is cleaned up...
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
