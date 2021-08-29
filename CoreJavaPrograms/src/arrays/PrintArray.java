package arrays;
/**
 * This Class Print Basic array elements in Integer , Double, Char , String.
 * @author prasa
 *
 */

public class PrintArray {
	public static void main(String[] args) {
		int array[] = { 1, 2, 9, 4, 5 };
		System.out.println("Integers are : ");

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		double arr[] = { 1.33, 4.55, 6.890, 213.3445 };
		System.out.println("Double Values are : ");

		for (int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		char c[] = { 'r', 'a', 'j', 'a' };
		System.out.print("Characters are : ");

		for (int k = 0; k < c.length; k++)

		{
			System.out.print(c[k]);
		}
		String str[] = { "Hai", "Array", "First", "Program" };
		System.out.println("Strings are : ");

		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}

	}

}
