package session4.advanceMath2;

import java.util.Scanner;

public class CalculatingTheCircumference {
	public static void main(String[] args) {

		// the program doesn't specify double or int. I will use double to be
		// more thorough
		double pi = Math.PI;
		double radius;
		double circumference;
		Scanner reader = new Scanner(System.in);

		// prompt user to enter radius
		System.out.print("Type the Radius: ");
		radius = Double.parseDouble(reader.nextLine());

		// calculation for radius
		circumference = 2 * pi * radius;

		System.out.println("Circumference of the circle: " + circumference);

		reader.close();
	}
}
