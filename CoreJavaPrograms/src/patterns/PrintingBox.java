package patterns;

import java.util.Scanner;

public class PrintingBox {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printBox(n);
	}

	public static void printBox(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)

				if (i == 1 || i == n || j == 1 || j == n) //i starts 1 so i = 1 upto i = n same as j
				{
					System.out.print(" * ");
				} else {
					System.out.print("   "); //doubleSpace
				}
			System.out.println(" ");
		}

	}

}
/*
 n = 5
 
 *  *  *  *  *  
 *           *  
 *           *  
 *           *  
 *  *  *  *  *  
 
 */
