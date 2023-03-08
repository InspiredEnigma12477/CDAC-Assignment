package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import static java.time.LocalDate.parse;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.UserDaoImpl;
import pojos.Role;
import static pojos.Role.valueOf;
import pojos.User;

public class GetSelectedUseDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			UserDaoImpl userDao = new UserDaoImpl();
			System.out.println("Enter date n role");
			userDao.getUserSomeDetailsByDateAndRole(parse(sc.next()), valueOf(sc.next().toUpperCase()))
					.forEach(u -> System.out.println(
							"Last Name " + u.getLastName() 
							+ " Reg amount " + u.getRegAmount() + " reged on" + u.getRegDate()));

			
		} // JVM : sc.close , sf.close() => DB cn pool is cleaned up...
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
