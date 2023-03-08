package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CategoryDaoImpl;
import dao.ProductDaoImpl;
import pojos.Category;
import pojos.Product;

public class RemoveProductFromCategory {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Hibernate up n running !" + sf);
			ProductDaoImpl dao = new ProductDaoImpl();
			System.out.println("Enter category id");
			long categoryId = sc.nextLong();
			System.out.println("Enter product id");
			long productId = sc.nextLong();
			System.out.println(dao.removeProductFromCategory(categoryId, productId));

		} // JVM : sf.close() => DB cn pool is cleaned up...
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
