package tester;

import com.app.core.Color;
import com.app.core.DeliveryAddress;
import com.app.core.Vehicle;

import custom_exceptions.ShowroomHandlingException;

import static utils.ValidationRules.*;

import java.text.ParseException;

public class TestAssociation {

	public static void main(String[] args) throws ParseException, ShowroomHandlingException {
		// Can you create delivery adr instance w/o it's owning Vehicle instance ? yes
		DeliveryAddress address1 = new DeliveryAddress("a", "b", "c", "d", "e", "32413");
		Vehicle v1 = new Vehicle("abc-12345", Color.BLACK, 45678, parseAndValidateDate("4-10-2022"), "Maruti");

	}

}
