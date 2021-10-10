package oops.arraylist;

import java.util.ArrayList;

import oops.classtostring.Town;

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

	ArrayList<oops.arraylist.Town> town; // class

	public String toString() {

		return "State Code = " + code + "\n" + "State Name = " + statename + "\n" + "People Count = " + peoplecount
				+ "\n" + "Town = " + town + "\n";
	}
}