package basicprograms;

import java.util.Scanner;

public class LeapYearOrNot {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();

		boolean flag = leapYear(year);
		if (flag == true) {
			System.out.println("Leap Year");
		} else {
			System.out.println("Not Leap Year");
		}
	}

	public static boolean leapYear(int year) {
		if (year % 4 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
