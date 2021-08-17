package strings;

public class FindCapsAndSmallLetters {
	public static void main(String[] args) {

		/*
		 * for (int i = 65; i <= 122; i++) { char c = (char) i; System.out.print(" " + c
		 * + " " + " " + i + " ,"); //Ascci Table }
		 */

		String str = "Hai Am Cool112260+=()";

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);

			if (c >= 65 && c <= 90) 
			{
				System.out.println(c + " Captial Letter");
			} 
			else if (c >= 97 && c <= 122) 
			{
				System.out.println(c + " Small Letter");
			} 
			 else if (c >= 47 && c <= 57) {
				System.out.println(c + " is Number");
			} else {
				System.out.println(c + " is Special Character");
			}
			
		}

	}

}
