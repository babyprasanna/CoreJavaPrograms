package arrays;

import java.util.Scanner;

public class Reverse_Of_Array {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int array[] = new int[5];
		System.out.println("Enter Elements Into Array : ");
		
		for(int i = 0; i < array.length; i++)
		{
			array[i] = sc.nextInt();
		}
		
		System.out.println("reveres of Array : " );
				
		for(int i = array.length - 1; i >= 0; i--)
		{
			System.out.println(array[i]);
		}
	}

}
