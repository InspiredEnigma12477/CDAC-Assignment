package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.RoleDaoImpl;
import pojos.Role;
import pojos.UserRole;

public class AddNewRole {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create role dao instance
			RoleDaoImpl roleDao = new RoleDaoImpl();
			System.out.println("Enter role name ");
			System.out.println(roleDao.addRole(new Role(UserRole.valueOf(sc.next().toUpperCase()))));

		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
