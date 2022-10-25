package tester;

import java.util.Scanner;

import enums.Color;

import static enums.Color.*;

public class TestEnum {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// display all colors
			System.out.println("All colors : ");
			for (Color c : values())
				System.out.println(c);
			System.out.println("Choose a color");
			Color chosenColor = valueOf(sc.next().toUpperCase());
			System.out.println("You chose " + chosenColor);

	} 
//			catch (Exception e) {
//			e.printStackTrace();
//		}

	}

}
