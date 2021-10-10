package oops.basic3;

/**
 * This Class Contains Students Details
 * 
 * @author prasa
 *
 */

public class Student {

	String collegenameofstudent;
	long studentid;
	String branch;
	long sem;
	long year;
	float percentage;

	public String toString() {

		return "College Name Of Student = " + collegenameofstudent + "\n" + "Student Id = " + studentid + "\n"
				+ "Branch = " + branch + "\n" + "Semister = " + sem + "\n" + "Year = " + year + "\n" + "Percentage = "
				+ percentage + "\n";

	}
}
