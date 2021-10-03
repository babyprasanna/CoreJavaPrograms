package oops.basic2;

/**
 * This Class Contains College Details
 * 
 * @author prasa
 *
 */

public class College {

	boolean privatecollege = false;
	boolean govermentcollege = false;
	long college_code;
	long college_students_count;

	public String toString() {
		return "Private College = " + privatecollege + "\n" + "Goverment College = " + govermentcollege + "\n" + "College Code"
				+ college_code + "\n" + "No Of Students = " + college_students_count + "\n";
	}
}
