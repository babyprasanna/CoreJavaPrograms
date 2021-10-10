package oops.arraylist;

import java.util.ArrayList;
import java.util.Random;

/**
 * This Class Contains Home Details
 * 
 * @author prasa
 *
 */

public class Home {

	String hometype;
	String nameofhome;
	String area;

	ArrayList<Room> room;

	public String toString() {

		return "Home Type = " + hometype + "\n" + "Name Of Home = " + nameofhome + "\n" + "Area = " + area + "\n"
				+ "Rooms in Home = " + room + "\n";
	}
}