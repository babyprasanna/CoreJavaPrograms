package oops.basic2;

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

	Room room;

	public String toString() {

		return "Home Type = " + hometype + "\n" + "Name Of Home = " + nameofhome + "\n" + "Area = " + area + "\n"
				+ "Rooms in Home = " + room + "\n";
	}
}
