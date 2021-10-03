package oops.basic;

/**
 * This Class Contains Employee_Project Details
 * 
 * @author prasa
 *
 */

public class Employee_Project {

	int project_code;
	String project_name;
	String team_name;
	long team_members;
	String start_date = "MM/DD/YYYY";
	String end_date = "MM/DD/YYYY";

	public String toString() {
		return "Project Code = " + project_code + "\n" + "Project Name = " + project_name + "\n" + "Team Name = "
				+ team_name + "\n" + "Team Members = " + team_members + "\n" + "Project Start Date = " + start_date + "\n"
				+ "Project End Date = " + end_date + "\n";
	}
}
