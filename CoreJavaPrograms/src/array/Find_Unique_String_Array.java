package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Find_Unique_String_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] string = { "raja", "hai", "raja", "hello", "hai", "raja", "hello", "raja", "hai", "me","u","hai"};
		int arr[] = new int[12];
		HashSet<String> list = new HashSet<>();
		
		for(int i = 0; i < string.length; i++)
		{
			boolean flag = false;
			if(arr[i] != -1) {
				
				for(int j = i + 1; j < string.length; j++)
				{
					if(string[i].equals(string[j])) {
						flag = true;
						arr[j] = -1;
					}
				}
				if(!flag) {
					list.add(string[i]);
				}
			}
		}
		
		System.out.println("Unique of str : " + list);
	}
}