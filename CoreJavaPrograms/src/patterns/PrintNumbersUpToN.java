package patterns;

import java.util.Scanner;
/**
 * This Class Print Numbers 
 * Sample Input - n = 5

1  2  3  4  5  
6  7  8  9  10  
11  12  13  14  15  
16  17  18  19  20  
21  22  23  24  25 

 * @author prasa
 *
 */

public class PrintNumbersUpToN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printUptoNnumbers(n);
	}
/**
 * This Method Print Numbers
 * @param n Number
 */
	public static void printUptoNnumbers(int n) {
		int count = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(" " + count + " ");
				count++;
			}
			System.out.println(" ");
		}
	}
}

/*
n = 5

1  2  3  4  5  
6  7  8  9  10  
11  12  13  14  15  
16  17  18  19  20  
21  22  23  24  25 
 
*/