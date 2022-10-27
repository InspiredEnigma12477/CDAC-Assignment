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
				System.out
						.println("Options : 1. Add a vehicle 2. Display 3. Display all vehicles having specified color"
								+ "4. Apply discount to a particular vehicle 5. Purchase a vehicle 10. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1:
						if (counter < vehicles.length) {
							System.out.println(
									"Enter vehicle details : chasisNo,  color,  basePrice,  manufactureDate(day-mon-yr),  company");
							Vehicle v1 = new Vehicle(validateChasisNo(sc.next(), vehicles), validateColor(sc.next()),
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

					case 3:
						System.out.println("Enter the color");
						Color chosenClr = validateColor(sc.next());
						// => color is valid
						for (Vehicle v : vehicles) {
							if (v != null && v.getColor().equals(chosenClr))
								System.out.println(v);
						}
						break;

					case 4:
						System.out.println("Enter chasis no n discount amount");
						String chNo = sc.next();
						double discount = sc.nextDouble();
						Vehicle foundVehicle = findByChasisNo(chNo, vehicles);
						// => vehicle found
						foundVehicle.setBasePrice(foundVehicle.getBasePrice() - discount);
						System.out.println("Applied discount...");
						break;

					case 5:// purchase a vehicle
						sc.nextLine();
						System.out.println("Enter chasis no");
						chNo = sc.nextLine();
						foundVehicle = findByChasisNo(chNo, vehicles);
						// => vehicle found --chk for its availabilty
						if (foundVehicle.getAddress() == null) {
							// => avlable --> prompt for adr
							System.out.println(
									"Enter delivery adr : addressLine1,  addressLine2,  city,  state,  country , zip code");
							// call a method to assign/link the adr to the vehicle
							foundVehicle.linkAddress(sc.nextLine(), sc.nextLine(), sc.next(), sc.next(), sc.next(),
									sc.next());
						} else
							throw new ShowroomHandlingException("Vehicle not available for purchasing !!!!!!");
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
