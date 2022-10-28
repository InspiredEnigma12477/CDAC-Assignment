package tester;

import java.util.Date;

import com.app.core.Vehicle;

public class Test2 {

	public static void main(String[] args) {
		//String color, double basePrice, Date manufactureDate, String company)
		Vehicle v1=new Vehicle("abc-12345", "white", 123456, new Date(), "Maruti");
		Vehicle v2=new Vehicle("abc-12345", "white", 123456, new Date(), "Maruti");
		System.out.println(v1.equals(v2));//t
		System.out.println(v1.hashCode()+" "+v2.hashCode());//different adr
		Vehicle v3=new Vehicle("abc-1345", "white", 123456, new Date(), "Maruti");
		System.out.println(v1.equals(v3));//f
		
	}

}
