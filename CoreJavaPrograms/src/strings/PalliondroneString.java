package strings;

public class PalliondroneString {
	public static void main(String[] args) {
		String str = ("iahai");
		// String str = ("iahaio");
		System.out.println("Given String Is : " + str);
		String str3 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str3 = str3 + str.charAt(i);
		}
		System.out.println("After Reverse String Is : " + str3);

		if (str.equals(str3)) // euqals Check content same in str and str 3
		{
			System.out.println("Parllondrone");
		} else {
			System.out.println("Not Parllonderone");
		}
	}

}
