package strings;

public class SpecialStringOrNot {
	public static void main(String[] args) {
		String str = "am cool";
		//String str = "Raj is string";
		boolean flag = false;

		for (int i = 0; i < str.length() - 1; i++) {
			char first = str.charAt(i);
			char second = str.charAt(i + 1);

			if (isVowel(first) && isVowel(second)) {
				flag = true;
				break;
			}
		}
		if (flag) {
			System.out.println(str + " is a special string");
		} else {
			System.out.println(str + " is not a special string");
		}

	}

	public static boolean isVowel(char letter) {
		if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
				|| letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {

			return true;

		} else {

			return false;

		}

	}
}
