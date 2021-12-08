package exceptions;

import javax.naming.NamingException;

public class HandleExceptionThrows {
	public static void main(String[] args) {

		HandleExceptionThrows obj = new HandleExceptionThrows();
		obj.method();
		obj.method1();
		obj.method2();
	}

	public void method() {
		int a = 10, b = 20, c;
		c = a + b;
		System.out.println("c = " + c);
	}

	public void method1() {

		try {
			int a = Integer.parseInt("2.22");
			
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
	}

	public void method2() {
		String str = "hai";
		System.out.println(str);
	}

}
