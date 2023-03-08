package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CategoryDaoImpl;
import dao.ProductDaoImpl;
import pojos.Category;
import pojos.Product;

public class AddProductToCategory {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Hibernate up n running !" + sf);
			ProductDaoImpl dao = new ProductDaoImpl();
			System.out.println("Enter category id");
			long categoryId = sc.nextLong();
			sc.nextLine();
			System.out.println("Product Name");
			String name = sc.nextLine();
			System.out.println("Enter price");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter product desc");
			System.out.println(dao.addProductToCategory(categoryId, new Product(name, price, sc.nextLine())));

		} // JVM : sf.close() => DB cn pool is cleaned up...
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
