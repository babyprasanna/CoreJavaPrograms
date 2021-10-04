package oops.basic;

/**
 * This Class Contains Employee_Project Details
 * 
 * @author prasa
 *
 */

public class EmployeesProject {

	int projectcode;
	String projectname;
	String teamname;
	long teammembers;
	String startdate = "MM/DD/YYYY";
	String enddate = "MM/DD/YYYY";

	public String toString() {
		return "Project Code = " + projectcode + "\n" + "Project Name = " + projectname + "\n" + "Team Name = "
				+ teamname + "\n" + "Team Members = " + teammembers + "\n" + "Project Start Date = " + startdate + "\n"
				+ "Project End Date = " + enddate + "\n";
	}
}
