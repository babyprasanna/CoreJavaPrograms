package arrays;

import java.util.Scanner;
/**
 * This Class read Dynamically elements and Print Element 
 * @author prasa
 *
 */

public class Print_Array_Dynamaic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter elements");
		int array[] = new int[4];

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Integer array values is ");
		for (int i = 0; i < array.length; i++)

		{
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
		System.out.println("Enter elements Double");
		double d[] = new double[4];

		for (int i = 0; i < d.length; i++) {
			d[i] = sc.nextDouble();
		}
		System.out.println("Doble array values is : ");
		for (int i = 0; i < d.length; i++) {
			System.out.print(d[i] + " , ");
		}
		System.out.println("\n");
		System.out.println("Enter String : ");
		String str[] = new String[4];
		
		for(int i = 0; i < str.length; i++)
		{
			str[i] = sc.nextLine();
		}
		for(int i = 0; i < str.length; i++)
		{
			System.out.println(str[i] + " ");
		}
	}

}
