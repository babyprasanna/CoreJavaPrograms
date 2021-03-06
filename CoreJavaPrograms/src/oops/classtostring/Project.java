package oops.classtostring;

/**
 * THis Class Contains Project Details
 * 
 * @author prasa
 *
 */

public class Project {

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
