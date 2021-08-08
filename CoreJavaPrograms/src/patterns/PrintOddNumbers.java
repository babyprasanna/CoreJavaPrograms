package patterns;

import java.util.Scanner;

public class PrintOddNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printOddNumber(n);
	}

	public static void printOddNumber(int n) {
		int count = 1;

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

1  3  5  7  
9  11  13  15  
17  19  21  23  
25  27  29  31  
*/