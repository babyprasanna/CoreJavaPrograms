package oops.classtostring;

/**
 * This Class Contains Students Details and Branch class
 * 
 * @author prasa
 *
 */

public class Students {

	int rollno;
	String name;
	long year;
	int semister;
	float percentage;
	boolean jobholder = false;

	Branch branch;

	public String toString() {
		return "Roll_Number = " + rollno + "\n" + "Name of Student = " + name + "\n" + "Year Of Student = " + year
				+ "\n" + "Branch : " + branch + "Semister = " + semister + "\n" + "Percentage of Student = "
				+ percentage + "\n" + "Job Holder Status = " + jobholder + "\n";
	}

}
