package hashset;

import java.util.HashSet;

public class PrintElements_Array_HashSet {
	public static void main(String[] args) {
		HashSet<Integer> hashset = new HashSet();
		int array[] = {1, 2, 3, 4, 2, 1, 5 };

		System.out.println("Elements in Array : ");
		for (int number : array) {
			hashset.add(number);
			
		}
		System.out.print(hashset + " ");
		
		System.out.println(array.length - hashset.size());

	}

}
