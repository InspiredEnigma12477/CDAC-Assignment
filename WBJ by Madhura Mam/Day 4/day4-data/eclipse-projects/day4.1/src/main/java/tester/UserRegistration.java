package tester;

import static utils.HibernateUtils.getFactory;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CategoryDaoImpl;
import dao.UserDaoimpl;
import pojos.Category;
import pojos.Role;
import pojos.ShoppingCart;
import pojos.User;

import static java.time.LocalDate.parse;
import static pojos.Role.valueOf;

public class UserRegistration {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Hibernate up n running !" + sf);
			UserDaoimpl userDao = new UserDaoimpl();
			System.out.println("Enter new user details : firstName,  lastName,  email,  password,  userRole,  dob");
			User user = new User(sc.next(), sc.next(), sc.next(), sc.next(), valueOf(sc.next().toUpperCase()),
					parse(sc.next()));
			//establish a link
			user.addCart(new ShoppingCart());
			System.out.println(userDao.registerUser(user));
		} // JVM : sf.close() => DB cn pool is cleaned up...
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
