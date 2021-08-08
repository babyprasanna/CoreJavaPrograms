package basicprograms;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year1 = input.nextInt();

		int year = leapYear(year1);

	}

	public static int leapYear(int year) {
		if (year % 4 == 0) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}
		return year;
	}

}
