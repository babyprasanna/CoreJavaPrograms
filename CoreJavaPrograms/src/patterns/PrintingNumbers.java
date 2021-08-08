package patterns;

import java.util.Scanner;

public class PrintingNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printnNumber(n);
	}

	public static void printnNumber(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + i + " ");
			}
			System.out.println(" ");
		}
	}

}
/*
n = 4

1  1  1  1  
2  2  2  2  
3  3  3  3  
4  4  4  4 

*/