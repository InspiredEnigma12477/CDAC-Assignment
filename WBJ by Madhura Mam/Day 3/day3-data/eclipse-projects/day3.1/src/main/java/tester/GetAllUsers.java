package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.UserDaoImpl;
import pojos.Role;
import pojos.User;

public class GetAllUsers {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory()) {
			// create user dao instance
			UserDaoImpl userDao = new UserDaoImpl();
			userDao.getAllUsers().forEach(System.out::println);//u -> System.out.println(u)
		} // JVM : sc.close , sf.close() => DB cn pool is cleaned up...
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
