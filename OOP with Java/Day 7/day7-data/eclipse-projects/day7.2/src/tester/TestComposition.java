package tester;

import static utils.ValidationRules.parseAndValidateDate;

import java.text.ParseException;

import com.app.core.Color;
import com.app.core.Vehicle;

import custom_exceptions.ShowroomHandlingException;

public class TestComposition {

	public static void main(String[] args) throws ParseException, ShowroomHandlingException {
		// Can you create delivery adr instance w/o it's owning Vehicle instance ? no =>
		// composition (stronger form of asso.)
		// DeliveryAddress address1 = new DeliveryAddress("a", "b", "c", "d", "e",
		// "32413");
		Vehicle v1 = new Vehicle("abc-12345", Color.BLACK, 45678, parseAndValidateDate("4-10-2022"), "Maruti");
		Vehicle.DeliveryAddress address = v1.new DeliveryAddress("a", "b", "c", "d", "e", "32413");
		// Can above be done in a single java stmt ? YES
		Vehicle.DeliveryAddress adr2 = new Vehicle("abc-12345", Color.BLACK, 45678, parseAndValidateDate("4-10-2022"),
				"Maruti").new DeliveryAddress("a", "b", "c", "d", "e", "32413");

	}

}
