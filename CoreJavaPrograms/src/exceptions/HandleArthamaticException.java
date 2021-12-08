package exceptions;

public class HandleArthamaticException {

	public static void main(String[] args) {
		try {

			int a = 10;
			int b = 0;
			int c;
			c = a / b;
		} catch (ArithmeticException e) {
			System.out.println(e);
		}

	}

}
