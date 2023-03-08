package tester;

import static utils.HibernateUtils.getFactory;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import dao.CategoryDaoImpl;
import pojos.Category;

public class DisplayCategoryAndProductDetails {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory(); Scanner sc = new Scanner(System.in)) {
			System.out.println("Hibernate up n running !" + sf);
			CategoryDaoImpl dao = new CategoryDaoImpl();
			System.out.println("Enter category name");
			String name = sc.nextLine();
			Category category = dao.getCategoryAndProductDetails(name);
			System.out.println("Category details ");
			System.out.println(category);
			System.out.println("Product Details");
			category.getProducts().forEach(System.out::println);
		} // JVM : sf.close() => DB cn pool is cleaned up...
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
