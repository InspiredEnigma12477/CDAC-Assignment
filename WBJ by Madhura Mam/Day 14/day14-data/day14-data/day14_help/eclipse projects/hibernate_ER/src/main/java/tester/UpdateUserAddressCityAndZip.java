package tester;

import static utils.HibernateUtils.getSf;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.AddressDaoImpl;

public class UpdateUserAddressCityAndZip {

	public static void main(String[] args) {
		try (SessionFactory sf = getSf(); Scanner sc = new Scanner(System.in)) {
			AddressDaoImpl adrDao = new AddressDaoImpl();
			System.out.println("Enter  userId, newCity, newZipode , to change the address");
			System.out.println(adrDao.updateAddress(sc.nextLong(), sc.next(), sc.next()));

		} // sf.close() => cleaning up db cn pool !
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
