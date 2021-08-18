package strings;

public class FindCharInString {
	public static void main(String[] args) {

		String str = "Raj Am Cool";

		System.out.println("String is : " + str);

		boolean flag = false;
		boolean letter = isCharExistOrNot(str);
		if (true) {
			System.out.println("Letter There in String");
			
		} else {
			System.out.println("Letter Not There in String");
		}
	}

	public static boolean isCharExistOrNot(String str) {
		char key = 'o';
		// char key = 'r';
		boolean flag = false;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == key) {
				flag = true;
				break;
			}
		}
		if (flag == true) {
			System.out.println("Char is : " + key );
			System.out.println("In the Index Of : " + str.indexOf(key));
			return true;
		} else {
			return false;
		}
	}
}
