package exceptions;

import javax.naming.InvalidNameException;

public class HandeNamingException {
	public static void main(String[] args) {

		String name = "prasanna22";

		try {

			for (int i = 0; i < name.length(); i++) {
				char c = name.charAt(i);
				if (c >= 48 && c <= 57) {
					throw new InvalidNameException("Name Invallied : " + name);
				}
			}
		} catch (InvalidNameException e) {
			System.out.println(e);
		}
		System.out.println("Name is : " + name);
	}

}
