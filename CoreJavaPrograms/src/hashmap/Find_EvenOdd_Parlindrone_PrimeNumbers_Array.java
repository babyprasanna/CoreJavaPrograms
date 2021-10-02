package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Find_EvenOdd_Parlindrone_PrimeNumbers_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[10];
		System.out.println("Enter Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		HashMap<String, Integer> evenodd = evenOdd(array);
		
		if(evenodd)
		{
			for(Entry<String, Integer> number : evenodd.entrySet())
			{
					System.out.println("EVEN Numbers are : " + number);
			}else
				{
					System.out.println("ODD Numbers are : " + number);
				}
		}
	}

	private static HashMap<String, Integer> evenOdd(int[] array) {

		HashMap evenoddnumber = new HashMap();
		boolean falg = false;
		int count = 0;

		for (int number : array) {
			if (number % 2 == 0) {
				falg = true;
			}
		}
		if (falg == true) {
			evenoddnumber.put(array, count++);
		} else {
			evenoddnumber.put(array, count++);
		}
		return evenoddnumber;
	}
}
