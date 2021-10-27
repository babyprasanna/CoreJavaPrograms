package oops.inheritancebasic;

public class Hello extends Welcome {

	private String name = "Hello";

	public String getName() {
		return super.getName() + " " + name;
	}
}
