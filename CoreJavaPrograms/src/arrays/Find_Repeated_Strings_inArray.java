package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class Find_Repeated_Strings_inArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String array[] = { "raja", "hai", "raja", "hello", "hai", "raja", "hello", "raja", "hai", "raja","me" };
		
		HashSet<String> str = repeatedStrings(array);
		HashSet<String> str1 = singleTimeRepeatedString(array);
		HashSet<String> single = new HashSet<>(str1);
			
		for(String s: str) {
			single.remove(s);
		}
		
		System.out.println(str);
		System.out.println(str1);
		System.out.println(single);

	}
	
	private static HashSet<String> repeatedStrings(String[] array){
		HashSet<String> repeatedstrings = new HashSet();
		String str = "";
		int count = 0, maxcount = 0;

		for (int i = 0; i < array.length; i++) {
			str = array[i];
			for (int j = i + 1; j < array.length; j++) {

				if (array[i].equals(array[j])) {
					repeatedstrings.add(array[i]);
					break;
				}
			}
		}
		return repeatedstrings;
	}

	private static HashSet<String> singleTimeRepeatedString(String[] array) {
		HashSet<String> str = new HashSet();

		for (String string : array) {
			str.add(string);
		}
		return str;

	}
}
