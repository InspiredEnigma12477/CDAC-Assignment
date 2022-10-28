package tester;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

import com.app.core.Vehicle;
//how to use import static , to directly access sdf ?
import static com.app.core.Vehicle.sdf;

public class Test1 {

	public static void main(String[] args) /* throws ParseException */{
		// create vehicle instance , by accepting all i/ps from user
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter vehicle details : chasisNo,  color,  basePrice,  manufactureDate,  company");
			Vehicle v1 = new Vehicle(sc.next(), sc.next(), sc.nextDouble(), sdf.parse(sc.next()), sc.next());
			System.out.println(v1);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
