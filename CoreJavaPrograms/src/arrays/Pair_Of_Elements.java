package arrays;

import java.util.Scanner;

public class Pair_Of_Elements {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int array[] = new int[5];
		int temp[] = new int[5];
		int count = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = input.nextInt();
			temp[i] = array[i];
		}
		for (int i = 0; i < array.length - 1; i++) {
	
			for (int j = i + 1; j < array.length; j++) {
				
				if (temp[i] != -1) 
				{
					if(temp[i] == temp[j])
					{
						count++;
						temp[j] = -1;
						break;
					}
				} 
			}
		}
		
		for(int i = 0 ; i < temp.length; i++) {
			
			if(temp[i] == -1) {
				System.out.println(array[i] + " has a pair");
			}
		}
		System.out.println("Total pairs = " + count);
	}

}
