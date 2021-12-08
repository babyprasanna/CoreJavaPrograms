package strings;

public class BasicExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");

		StringBuffer sb1 = new StringBuffer();
		sb1.append("Hello");

		String s = "Hello";
		s.concat(s);

		String s1 = "Hello";
		s1.concat(s1);

		StringBuilder sbu = new StringBuilder();
		sbu.append("Hello");

		StringBuilder sbu1 = new StringBuilder();
		sbu1.append("Hello");

		System.out.println(sb.equals(sb1)); // ex o/p: false

		System.out.println(s == s1); // true

		System.out.println(sb == sb1); // false

		System.out.println(s.equals(s1)); // true

		System.out.println(sbu == sbu1); // false

		System.out.println(sbu.equals(sbu1)); // false

		String str = new String("Hello");
		String str1 = new String("Hello");

		System.out.println(str == str1); // false

		System.out.println(str.equals(str1)); // true

		System.out.println(s == str1); // false

		System.out.println(s.equals(str1)); // true
		
		System.out.println(s.equals(sbu)); // false
		
		System.out.println(s.equals(sb)); // false
	}
}
