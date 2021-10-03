package oops.basic2;

/**
 * This Class About Project Status and Details
 * 
 * @author prasa
 *
 */

public class Project {

	String project_name;
	boolean finish_status = false;
	long no_of_days_complete;
	boolean profits = false;

	public String toString() {
		return "Project Name = " + project_name + "\n" + "Status Of Project = " + finish_status + "\n"
				+ "Days to Complete Project = " + no_of_days_complete + "\n" + "Profits = " + profits + "\n";
	}
}
