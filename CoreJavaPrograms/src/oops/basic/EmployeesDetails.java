package oops.basic;

/**
 * This Class Contains Employees Details
 * 
 * @author prasa
 *
 */
public class EmployeesDetails {

	String name;
	long empno;
	String role;
	String projectname;
	boolean permanentstatus = false;

	public String toString() {
		return "Name of Employee = " + name + "\n" + "Employee Number = " + empno + "\n" + "Employee Role = " + role
				+ "\n" + "Project Name = " + projectname + "\n" + "Employee Job Status = " + permanentstatus + "\n";
	}
}
