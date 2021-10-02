package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Repeated_Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[6];
		System.out.println("Enter Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		repeatedNumber(array);
	}

	private static void repeatedNumber(int[] array) {

		HashMap<Integer, Integer> numbersarray = new HashMap();

		for (int number : array) {
			if (numbersarray.containsKey(number)) {
				int value = numbersarray.get(number);
				numbersarray.put(number, value + 1);
			} else {
				numbersarray.put(number, 1);
			}
		}
		for (Entry<Integer, Integer> numberset : numbersarray.entrySet()) {
			System.out.println(numberset.getKey() + " -- >" + numberset.getValue());
		}
	}
}
