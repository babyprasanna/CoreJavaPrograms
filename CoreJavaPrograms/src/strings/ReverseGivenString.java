package strings;

public class ReverseGivenString {
	public static void main(String[] args) {
		
		String str = "String first code to reverse";
		//String str1 = ""; //String
		StringBuffer sb = new StringBuffer(); //StringBuffer
		
		for(int i = str.length() - 1; i >= 0; i--)
		{
			//str1 = str1 + str.charAt(i); //String
			sb.append(str.charAt(i)); //StringBuffer
		}
		
		//System.out.println(str + "  ----->  " + str1);//String
		System.out.println(str + "  ---->  " + sb); //StringBuffer
		
	}
}
