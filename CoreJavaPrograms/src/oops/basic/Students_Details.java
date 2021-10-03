package oops.basic;

/**
 * This class contains Students Details
 * 
 * @author prasa
 *
 */

public class Students_Details {

	int roll_no;
	String name;
	long year;
	int semister;
	float percentage;
	boolean jobholder = false;

	public String toString() {
		return "Roll_Number = " + roll_no + "\n" + "Name of Student = " + name + "\n" + "Year Of Student = " + year
				+ "\n" + "Semister = " + semister + "\n" + "Percentage of Student = " + percentage + "\n"
				+ "Job Holder Status = " + jobholder + "\n";
	}
}
