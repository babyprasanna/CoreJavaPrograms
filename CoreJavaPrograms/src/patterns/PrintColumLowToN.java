package patterns;

import java.util.Scanner;

public class PrintColumLowToN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printCloumLow(n);
	}

	public static void printCloumLow(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}
}
/*
 n = 4
 
 *  
 *  *  
 *  *  *  
 *  *  *  *
 
 */
