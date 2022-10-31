package custom_ordering;

import java.util.Comparator;

import com.app.core.Vehicle;

public class VehicleManuDateComparator implements Comparator<Vehicle> {
	@Override
	public int compare(Vehicle v1, Vehicle v2) {
		System.out.println("in compare : by date");
		return v1.getManufactureDate().compareTo(v2.getManufactureDate());
	}

}
