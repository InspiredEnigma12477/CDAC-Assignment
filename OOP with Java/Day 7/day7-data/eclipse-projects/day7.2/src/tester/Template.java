package tester;

import java.util.Scanner;

import com.app.core.Vehicle;

public class Template {

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

						break;

					case 2:
						break;
					case 10:
						exit = true;
						break;
					}
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
		}

	}

}
