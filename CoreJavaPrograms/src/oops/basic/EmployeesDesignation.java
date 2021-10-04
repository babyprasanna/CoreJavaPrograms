package oops.basic;

/**
 * This Class Contains Employees_Designation Details
 * 
 * @author prasa
 *
 */

public class EmployeesDesignation {

	long empno;
	int experience;
	String startdate = "DD/MM/YYYY";
	String enddate = "DD/MM/YYYY";
	long finalsettelment;
	char rating;
	long maxsal;
	long minsal;
	long basicsal;

	public String toString() {
		return "Employee Number = " + empno + "\n" + "Employee Experience = " + experience + "\n"
				+ " Designation Start Date = " + startdate + "\n" + "designation End Date = " + enddate + "\n"
				+ "Final Settelment = " + finalsettelment + "\n" + "Rating of Employee = " + rating + "\n"
				+ "Maximum Sal = " + maxsal + "\n" + "Minimum Sal = " + minsal + "\n" + "Basic Sal = " + basicsal
				+ "\n";
	}
}
