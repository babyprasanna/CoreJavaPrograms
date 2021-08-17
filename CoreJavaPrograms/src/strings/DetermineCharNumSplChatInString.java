package strings;

public class DetermineCharNumSplChatInString {
	public static void main(String[] args) {
		String str = "Raj11+60)";

		for (int i = 0; i <= str.length(); i++) {
			char c = str.charAt(i);
			{
				if (c >= 65 && c <= 90 || c >= 97 && c <= 122) {
					System.out.println(c + " is Character");
					
				} else if (c >= 47 && c <= 57) {
					System.out.println(c + " is Number ");
					
				} else {
					System.out.println(c + " is Special Char ");
				}
			}
		}
	}

}
