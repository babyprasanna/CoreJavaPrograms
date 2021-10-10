package oops.classtostring;

/**
 * This Class Contains State Details
 * 
 * @author prasa
 *
 */

public class State {

	long code;
	String statename;
	long peoplecount;

	Town town; //class

	public String toString() {

		return "State Code = " + code + "\n" + "State Name = " + statename + "\n" + "People Count = " + peoplecount
				+ "\n" + "Town = " + town + "\n";
	}
}
