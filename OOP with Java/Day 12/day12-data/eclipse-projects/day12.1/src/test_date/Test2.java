package test_date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
//			System.out.println("Enter yr , month in digit n day");
//			LocalDate date = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
//			System.out.println(date);
//			// using parse API
//			System.out.println("Enter date string : yr-mon-day");
//			LocalDate date2 = LocalDate.parse(sc.next());
//			System.out.println(date2);
//			System.out.println("is before " + date.isBefore(date2));
//			System.out.println("is after  " + date.isAfter(date2));
//			System.out.println("is equal " + date.isEqual(date2));
//			System.out.println("compareTo " + date.compareTo(date2));
//			System.out.println("Enter date : dd/M/yyyy");
//			// LocalDate : public static LocalDate parse(CharSequence s, DateTimeFormatter
//			// formatter)
//			LocalDate date3 = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/M/yyyy"));
//			System.out.println(date3);
			// display age of the user
			System.out.println("Ente DoB (yr-mon-day)");
			LocalDate dob=LocalDate.parse(sc.next());
			//java.time.Period : public static Period between(LocalDate start,LocalDate end)
			long ageInMonths=Period.between(dob, LocalDate.now()).toTotalMonths();
			System.out.println("age in monts "+ageInMonths);
			System.out.println("Enter expiry in days");
			LocalDate now=LocalDate.now();
			//display expiry date
			//LocalDate API : public  LocalDate plusDays(long days)
			LocalDate expDate = now.plusDays(sc.nextLong());
			System.out.println("Expiring on "+expDate);
			System.out.println(now);
		}

	}

}
