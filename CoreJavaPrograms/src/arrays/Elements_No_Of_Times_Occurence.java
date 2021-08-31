package arrays;

import java.util.Scanner;

/**
 * This Class Take only 10 , 20 , 30 , 40 , 50 , 60 , 70 , 80 , 90. Non Other
 * Then This Numbers the Index. And check No.Of occurs of numbers More Then Once
 * print those with No.Of times occurred
 * 
 * @author prasa
 *
 */

public class Elements_No_Of_Times_Occurence {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[5];
		int index = -1;
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, j = 0;
		System.out.println("Enter Elements Into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();

			if (array[i] == 10) {
				a++;
			} else if (array[i] == 20) {
				b++;
			} else if (array[i] == 30) {
				c++;
			} else if (array[i] == 40) {
				d++;
			} else if (array[i] == 50) {
				e++;
			} else if (array[i] == 60) {
				f++;
			} else if (array[i] == 70) {
				g++;
			} else if (array[i] == 80) {
				h++;
			} else if (array[i] == 90) {
				j++;
			} else {
				i--;
			}

		}
		for (int i = 0; i < array.length; i++) {
			if (a > 0) {
				System.out.println(array[i] + " Occured " + a);
			}
			if (b > 0) {
				System.out.println(array[i] + " Occured " + b);
			}
			if (c > 0) {
				System.out.println(array[i] + " Occured " + c);
			}
			if (d > 0) {
				System.out.println(array[i] + " Occured " + d);
			}
			if (e > 0) {
				System.out.println(array[i] + " Occured " + e);
			}
			if (f > 0) {
				System.out.println(array[i] + " Occured " + f);
			}
			if (g > 0) {
				System.out.println(array[i] + " Occured " + g);
			}
			if (h > 0) {
				System.out.println(array[i] + " Occured " + h);
			}
			if (j > 0) {
				System.out.println(array[i] + " Occured " + j);
			}
		}

	}

}
