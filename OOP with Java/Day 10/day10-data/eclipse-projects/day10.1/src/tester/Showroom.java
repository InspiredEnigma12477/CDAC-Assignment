package tester;

import static utils.ShowroomUtils.populateShowroom;
import static utils.ValidationRules.findByChasisNo;
import static utils.ValidationRules.parseAndValidateDate;
import static utils.ValidationRules.validateChasisNo;
import static utils.ValidationRules.validateColor;
import static utils.ValidationRules.validatePrice;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exceptions.ShowroomHandlingException;
import custom_ordering.VehicleManuDateComparator;

public class Showroom {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// init / set up phase of the app

			// create suitably populated array list to hold vehicle type of refs
			List<Vehicle> list = populateShowroom();
			boolean exit = false;
			// clnt servicing phase
			while (!exit) {
				System.out
						.println("Options : 1. Add a vehicle 2. Display 3. Display all vehicles having specified color"
								+ "4. Apply discount to a particular vehicle 5. Purchase a vehicle "
								+ "6. Remove vehilce details 7. Sort vehicle details as per chansis no "
								+ "8. Sort vehicle details , as per date  : custom ordering , using separate comparator class"
								+ "9. Sort vehicle details , as per date  : custom ordering , using ano inner class"
								+ "10. Sort vehicle details , as per date  n price : custom ordering , using ano inner class"
								+ "100. Exit");
				System.out.println("Choose");
				try {
					switch (sc.nextInt()) {
					case 1:

						System.out.println(
								"Enter vehicle details : chasisNo,  color,  basePrice,  manufactureDate(day-mon-yr),  company");
						Vehicle v1 = new Vehicle(validateChasisNo(sc.next(), list), validateColor(sc.next()),
								validatePrice(sc.nextDouble()), parseAndValidateDate(sc.next()), sc.next());
						list.add(v1);
						System.out.println("Vehicle added to the showroom");

						break;

					case 2:
						System.out.println("Showroom details");
						for (Vehicle v : list)
							if (v != null)
								System.out.println(v);
						break;

					case 3:// NOTE : If the searching criteria IS NOT Uniquq ID(PK) based : you CAN NOT use
							// APIs : contains , indexOf ...
							// since all of them are based upon "equals" !
						System.out.println("Enter the color");
						Color chosenClr = validateColor(sc.next());
						// => color is valid
						for (Vehicle v : list) {
							if (v.getColor().equals(chosenClr))
								System.out.println(v);
						}
						break;

					case 4:
						System.out.println("Enter chasis no n discount amount");
						String chNo = sc.next();
						double discount = sc.nextDouble();
						Vehicle foundVehicle = findByChasisNo(chNo, list);
						// => vehicle found
						foundVehicle.setBasePrice(foundVehicle.getBasePrice() - discount);
						System.out.println("Applied discount...");
						break;
//
					case 5:// purchase a vehicle
						sc.nextLine();
						System.out.println("Enter chasis no");
						chNo = sc.nextLine();
						foundVehicle = findByChasisNo(chNo, list);
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
					case 6:
						System.out.println("Enter chasis no");
						chNo = sc.next();
						// API of AL : public boolean remove(Object o)
						v1 = new Vehicle(chNo);
						if (list.remove(v1))
							System.out.println("Vehicle details are removed!");
						else
							throw new ShowroomHandlingException(
									"Vehicle can't be removed : invalid chasis no !!!!!!!!!!");
						break;
					case 7:
						// sorting as per chasis no
						Collections.sort(list);
						break;
					case 8: // sorting as per date : custom ordering
						Collections.sort(list, new VehicleManuDateComparator());
						break;
					case 9:// sorting as per date : custom ordering : using ano inner class
						Collections.sort(list, new Comparator<Vehicle>() {

							@Override
							public int compare(Vehicle o1, Vehicle o2) {
								System.out.println("in compare : date , ano inner cls");
								return o1.getManufactureDate().compareTo(o2.getManufactureDate());
							}

						});
						break;
					case 10:
						Collections.sort(list, new Comparator<Vehicle>() {

							@Override
							public int compare(Vehicle o1, Vehicle o2) {
								System.out.println("in compare : date n price");
								int retVal = o1.getManufactureDate().compareTo(o2.getManufactureDate());
								if (retVal == 0) {
									// same date --so compare by price
									return ((Double) o1.getBasePrice()).compareTo(o2.getBasePrice());
								}
								return retVal;
							}

						});
						break;
					case 100:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
					// there may be some pending i/ps : read them off
					sc.nextLine();
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
