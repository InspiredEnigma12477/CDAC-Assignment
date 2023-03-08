package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.UserDaoImpl;

public class FindUsersByCity {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDaoImpl userDao = new UserDaoImpl();
			System.out.println("Enter city ");
			String city = sc.next();
			System.out.println("Users from city : " + city);
			userDao.getUsersByCity(city).forEach(System.out::println);

		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
