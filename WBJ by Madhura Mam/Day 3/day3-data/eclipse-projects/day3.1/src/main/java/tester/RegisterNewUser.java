package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.UserDaoImpl;
import pojos.Role;
import pojos.User;

public class RegisterNewUser {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			// create user dao instance
			UserDaoImpl userDao = new UserDaoImpl();
			System.out.println(
					"Enter user details :  firstName,  lastName,  email,  password,  confirmPassword,  userRole, regAmount, regDate(yr-mon-day) ");
			User user = new User(sc.next(), sc.next(), sc.next(),
					sc.next(), sc.next(),
					Role.valueOf(sc.next().toUpperCase()), 
					sc.nextDouble(), LocalDate.parse(sc.next()));
			//invoke dao's method
			System.out.println(userDao.saveUserDetails(user));
		} // JVM : sc.close , sf.close() => DB cn pool is cleaned up...
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
