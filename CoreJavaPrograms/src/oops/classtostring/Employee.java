package oops.classtostring;

/**
 * This Class Contains Employee Details and Designation class
 * 
 * @author prasa
 *
 */

public class Employee {

	String name;
	long empno;
	String role;
	String projectname;
	boolean permanentstatus = false;

	Designation designation;

	public String toString() {
		return "Name of Employee = " + name + "\n" + "Employee Number = " + empno + "\n" + "Employee Role = " + role
				+ "\n" + "Project Name = " + projectname + "\n" + "Designation Details : " + "\n" + designation
				+ "Employee Job Status = " + permanentstatus + "\n";
	}

}
