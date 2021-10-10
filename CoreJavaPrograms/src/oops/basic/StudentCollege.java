package oops.basic;

/**
 * This Class Contains Student College Details
 * 
 * @author prasa
 *
 */
public class StudentCollege {

	long collegecode;
	String collegename;
	String location;
	long branchs;
	long studentscount;

	public String toString() {

		return "College Code = " + collegecode + "\n" + "Coallege Name : " + collegename + "\n" + "College Loacation = "
				+ location + "\n" + "Branches = " + branchs + "\n" + "No.Of Students in College = " + studentscount
				+ "\n";

	}
}
