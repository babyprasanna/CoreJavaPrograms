package strings;

public class HelloWorld {
	public static void main(String[] args) {
		String str = "Hello World";

		System.out.println(str);

		String str1 = "";

		for (int i = str.length() - 1; i >= 0; i--) // reverse string
		{
			str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);

		StringBuffer str2 = new StringBuffer();

		for (int i = str1.length() - 1; i >= 0; i--) // reverse StringBuffer
		{
			str2.append(str1.charAt(i));
		}
		System.out.println(str2);

	}
}
