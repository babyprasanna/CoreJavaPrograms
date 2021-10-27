package oops.inheritancebasic;

public class MiddleName extends FirstName {

	private String middlename = "Baby";

	public String getMiddlename() {
		return super.getName() + " " + middlename;
	}

}
