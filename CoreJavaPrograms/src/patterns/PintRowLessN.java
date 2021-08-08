package patterns;

import java.util.Scanner;

public class PintRowLessN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printLowRow(n);
	}

	public static void printLowRow(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" * ");
			}
			System.out.println(" ");
		}
	}

}
/*
 n = 4
 *  *  *  *  
 *  *  *  
 *  *  
 *  
*/