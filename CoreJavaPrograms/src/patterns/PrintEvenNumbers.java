package patterns;

import java.util.Scanner;

public class PrintEvenNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printEvenNumbers(n);
	}

	public static void printEvenNumbers(int n) {
		int count = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + count + " ");
				count += 2;
			}
			System.out.println(" ");
		}
	}
}

/*
n = 4
0  2  4  6  
8  10  12  14  
16  18  20  22  
24  26  28  30  
*/