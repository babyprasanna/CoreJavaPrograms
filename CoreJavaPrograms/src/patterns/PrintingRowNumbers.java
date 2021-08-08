package patterns;

import java.util.Scanner;

public class PrintingRowNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printRowNumbers(n);
	}

	public static void printRowNumbers(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("  " + i + " ");
			}
			System.out.println("  ");
		}
	}
}

/*
4
1   
2   2   
3   3   3   
4   4   4   4 
*/