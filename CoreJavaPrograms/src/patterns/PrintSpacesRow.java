package patterns;

import java.util.Scanner;

public class PrintSpacesRow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		printSpaceRow(n);
	}

	public static void printSpaceRow(int n) {

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i > j) {
					System.out.print("   "); // doublespace

				} else {
					System.out.print(" * ");
				}
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