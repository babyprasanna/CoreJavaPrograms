package patterns;

import java.util.Scanner;

/**
 * This Class Print " * "
 * 
 * Sample Input - n = 4
 
 *    *    *    *   
   *    *    *   
     *    *   
       *   
 * 
 * @author prasa
 *
 */
public class printDimend {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		dimendPrint(n);
	}
	/**
	 * This Method Print " * "
	 * @param n Number
	 */

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