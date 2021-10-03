package oops.basic2;

/**
 * This Class About Employee Designation Details
 * 
 * @author prasa
 *
 */

public class Designation {

	int resigned_teams;
	long resigned_count;
	String last_dates = "MM/DD/YYYY";
	boolean no_of_approved_resignations;

	public String toString() {
		return "Resigned Teams = " + resigned_teams + "\n" + "Resigned People Count = " + resigned_count + "\n"
				+ "Last Date = " + last_dates + "\n" + "Approved Resignations = " + no_of_approved_resignations + "\n";
	}
}
