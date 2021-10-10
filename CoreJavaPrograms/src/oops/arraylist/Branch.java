package oops.arraylist;

/**
 * This Class Contains Branch Details
 * 
 * @author prasa
 *
 */

public class Branch {

	long branchcode;
	String nameofbranch;
	long branchstudentscount;
	long passedoutstudentscount;

	public String toString() {

		return "Branch Code = " + branchcode + "\n" + "Name Of Branch = " + nameofbranch + "\n"
				+ "Students Count in Branch = " + branchstudentscount + "\n" + "PassedOut Students = "
				+ passedoutstudentscount + "\n";

	}
}
