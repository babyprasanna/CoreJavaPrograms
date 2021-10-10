package oops.basic3;

import java.util.ArrayList;

import oops.basic2.Town;

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

	ArrayList<oops.basic3.Town> town; // class

	public String toString() {

		return "State Code = " + code + "\n" + "State Name = " + statename + "\n" + "People Count = " + peoplecount
				+ "\n" + "Town = " + town + "\n";
	}
}