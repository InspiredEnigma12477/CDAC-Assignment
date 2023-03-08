package tester;

import static utils.HibernateUtils.getSf;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import org.hibernate.SessionFactory;

import dao.UserDaoImpl;
import pojos.UserRole;

public class AssignRolesToExistingUser {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create dao instance
			UserDaoImpl dao = new UserDaoImpl();
			System.out.println("Enter user id ");
			long userId = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter roles space separated :admin customer author");
			// how to convert space separated strings --> set
			Set<UserRole> roleSet = Arrays.stream(sc.nextLine().split(" ")) // Stream<String>
					.map(s -> UserRole.valueOf(s.toUpperCase())) // Stream<UserRole :enum>
					.collect(Collectors.toSet());// Set<UserRole>
			System.out.println(dao.assignRoles(userId,roleSet));

		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
