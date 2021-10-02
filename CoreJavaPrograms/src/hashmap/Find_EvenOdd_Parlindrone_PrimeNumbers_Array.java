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
		HashMap<String, Integer> evenodd = new HashMap();
		evenodd.put("Even", 0);
		evenodd.put("Odd", 0);

		for (int numbe : array) {

			if (evenOdd(numbe)) {

				evenodd.put("Even", evenodd.get("Even")+1);
			}else {
				evenodd.put("Odd", evenodd.get("Odd")+1);
			}
		}

	}

	private static boolean evenOdd(int number) {

		if (number % 2 == 0) {
			return true;
		}

		return false;
	}
}
