package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AddressDaoImpl;
import pojos.Address;

public class DisplayUserAndAddressDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			// create adr dao instance
			AddressDaoImpl dao = new AddressDaoImpl();
			System.out.println("Enter user id");
			long userId = sc.nextLong();
			Address address = dao.getUserAndAddressDetails(userId);
			System.out.println(address);
			System.out.println(address.getOwner());
		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
