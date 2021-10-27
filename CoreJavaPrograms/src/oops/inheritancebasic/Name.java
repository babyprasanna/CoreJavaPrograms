package oops.inheritancebasic;

public class Name extends MiddleName {

	private String name = "Prasanna";

	public String getName() {
		return super.getMiddlename() + " " + name;
	}

}
