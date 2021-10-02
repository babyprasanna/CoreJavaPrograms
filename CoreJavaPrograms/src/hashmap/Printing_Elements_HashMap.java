package hashmap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Printing_Elements_HashMap {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		HashMap<Integer,String>listofNamesHashMap = new HashMap();
		listofNamesHashMap.put(11, "Raja");
		listofNamesHashMap.put(60, "Rajendra");
		listofNamesHashMap.put(22, "Rajendra");
		
		
		System.out.println(listofNamesHashMap.get(11));
		System.out.println(listofNamesHashMap.get(60)); 
		
		 for(Entry<Integer, String> list : listofNamesHashMap.entrySet())
		{
			
			System.out.println(list.getKey() + " = " + list.getValue());
		} 
	}
}
