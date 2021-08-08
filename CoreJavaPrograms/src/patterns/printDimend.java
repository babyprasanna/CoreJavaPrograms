package patterns;

import java.util.Scanner;

public class printDimend {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		dimendPrint(n);
	}

	public static void dimendPrint(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++)
				if (i > j) {
					System.out.print("   ");
				} else {
					System.out.print("  *  ");
				}

			System.out.println(" ");
		}
	}
}
/*

n = 4
 *    *    *    *   
   *    *    *   
     *    *   
       *   
*/