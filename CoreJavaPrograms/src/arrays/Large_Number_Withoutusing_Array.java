package arrays;

import java.util.Scanner;

public class Large_Number_Withoutusing_Array {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements into List : ");
		int a = sc.nextInt();
		
		while (true)
		{
			if(a == -1)
			{
				break;
			}
			System.out.println(a);
			a = sc.nextInt();
		}
	}

}
