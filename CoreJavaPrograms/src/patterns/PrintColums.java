package patterns;

import java.util.Scanner;

public class PrintColums {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printColums(n);
	}

	public static void printColums(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println(" ");
		}
	}

}
/*
n = 4
1  2  3  4  
2  3  4  
3  4  
4  
*/