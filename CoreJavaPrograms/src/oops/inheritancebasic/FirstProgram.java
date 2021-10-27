package oops.inheritancebasic;

public class FirstProgram extends Hello {

	private String name = "This is First Program";

	public String getName() {
		return super.getName() + " " + name;
	}

}
