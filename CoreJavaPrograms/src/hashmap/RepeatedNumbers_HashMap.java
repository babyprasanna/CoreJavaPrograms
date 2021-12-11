package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import java.util.Scanner;

public class RepeatedNumbers_HashMap {
	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int array[] = new int[6];
		System.out.println("Enter Elements into Array : ");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		for (int num : array) {
			if (map.containsKey(num)) {
				int value = map.get(num);
				map.put(num, value + 1);
			} else {
				map.put(num, 1);
			}
		}

		for (Entry<Integer, Integer> findelementscout : map.entrySet()) {
			System.out.println(findelementscout.getKey() + "---->" + findelementscout.getValue());
		}
	}
}