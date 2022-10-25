package tester;

import java.util.Date;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exceptions.ShowroomHandlingException;
import static utils.ValidationRules.*;
import static com.app.core.Vehicle.sdf;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init / set up phase of the app
			System.out.println("Enter showroom capacity");
			// create suitable array to hold vehicle type of refs
			Vehicle[] vehicles = new Vehicle[sc.nextInt()];
			int counter = 0;
			boolean exit = false;
			// clnt servicing phase
			while (!exit) {
				System.out.println("Options : 1. Add a vehicle 2. Display 10. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1:
						if (counter < vehicles.length) {
							System.out.println(
									"Enter vehicle details : chasisNo,  color,  basePrice,  manufactureDate(day-mon-yr),  company");
							Vehicle v1 = new Vehicle(validateChasisNo(sc.next(),vehicles), validateColor(sc.next()),
									validatePrice(sc.nextDouble()), parseAndValidateDate(sc.next()), sc.next());
							vehicles[counter++] = v1;
							System.out.println("Vehicle added to the showroom");
						} else
							throw new ShowroomHandlingException("Showroom capacity full!!!!!");

						break;

					case 2:
						System.out.println("Showroom details");
						for (Vehicle v : vehicles)
							if (v != null)
								System.out.println(v);
						break;
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// there may be some pending i/ps : read them off
					sc.nextLine();
				}

			}
		}

	}

}
