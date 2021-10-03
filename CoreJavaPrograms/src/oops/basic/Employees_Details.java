package oops.basic;

/**
 * This Class Contains Employees_Details
 * 
 * @author prasa
 *
 */
public class Employees_Details {

	String name;
	long emp_no;
	String role;
	String projectname;
	boolean permanent_status = false;

	public String toString() {
		return "Name of Employee = " + name + "\n" + "Employee Number = " + emp_no + "\n" + "Employee Role = " + role
				+ "\n" + "Project Name = " + projectname + "\n" + "Employee Job Status = " + permanent_status + "\n";
	}
}
