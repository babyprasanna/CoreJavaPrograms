package exceptions;

public class HandleNumberFormateException {
	public static void main(String[] args) {
		
		int a = Integer.parseInt("10");
		double b = Double.parseDouble("2.4");
		
		int d = Integer.parseInt("22.1");  // java.lang.NumberFormatException
		
		
	}

}
