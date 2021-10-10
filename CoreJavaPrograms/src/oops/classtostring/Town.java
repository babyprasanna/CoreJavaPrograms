package oops.basic2;

/**
 * This Class Contains Town Details
 * 
 * @author prasa
 *
 */

public class Town {

	String townname;
	long code;

	Home home;

	public String toString() {

		return "Town Name = " + townname + "\n" + "Town Code = " + code + "\n" + "Homes = " + home + "\n";
	}
}
