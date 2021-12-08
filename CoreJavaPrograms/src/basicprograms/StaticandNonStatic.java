package basicprograms;

public class StaticandNonStatic {

	int a = 10;
	int b = 20;

	static int c = 30;
	static int d = 40;

	public void method() {
		int a = 10;
		int b = 30;
		meethod2();
		method3();
		System.out.println(this.a + " " + this.b);
		System.out.println(a + " " + b);

	}

	public void meethod2() {

		System.out.println(a + " " + b + " " + c + " " + d);

	}

	public static void method3() {

		int c = 10;
		int d = 40;

		System.out.println(c + " " + d);

		System.out.println(StaticandNonStatic.c + " " + StaticandNonStatic.d);

	}

	public static void main(String[] args) {

		method3();

		StaticandNonStatic obj = new StaticandNonStatic();
		obj.method();

	}
}
