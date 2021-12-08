package exceptions;

public class HandleNullPointerException {
	public static void main(String[] args) {

		try {

			String a = null;
			a.charAt(1);

		} catch (NullPointerException np) {
			System.err.println(np);
		}
	}

}
