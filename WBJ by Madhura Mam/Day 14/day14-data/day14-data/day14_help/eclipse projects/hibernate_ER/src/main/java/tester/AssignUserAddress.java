package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AddressDaoImpl;
import pojos.Address;

public class AssignUserAddress {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create adr dao instance
			AddressDaoImpl dao = new AddressDaoImpl();
			System.out.println("Enter user id");
			long userId = sc.nextLong();
			System.out.println("Enter adr dtls : adrLine1,  adrLine2,  city,  state,  country,  zipCode ");
			Address adr = new Address(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next());
			System.out.println(dao.assignUserAddress(userId, adr));
		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
