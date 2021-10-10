package oops.classtostring;

/**
 * This Class Contains College Details
 * 
 * @author prasa
 *
 */

public class College {

	String collegename;
	long collegecode;
	long stundentscount;
	long staffcount;

	public String toString() {

		return "College Name = " + collegename + "\n" + "College Code = " + collegecode + "\n" + "No.Of Students = "
				+ stundentscount + "\n" + "No.Of Staff = " + staffcount + "\n";
	}
}
