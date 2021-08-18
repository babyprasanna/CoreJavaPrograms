package strings;

public class Vowels {
	public static void main(String[] args) {
		String str = new String("am cOOl to dO this wooh");
		int count = 0, count1 = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
					|| str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				System.out.println(str.charAt(i) + " Vowlels ");
				count++;
				
			} 
			else {
				System.out.println(str.charAt(i) + " Consenets");
				count1++;
				
			}
			
		}
		System.out.println(count + " No.of Vowles");
		System.out.println(count1 + " No.of consenets");

	}

}
