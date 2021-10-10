package oops.basic3;

/**
 * This Class Contains Room Details
 * 
 * @author prasa
 *
 */

public class Room {

	String roomname;
	long width;
	long hight;
	long roommembers;

	public String toString() {

		return "Room Name = " + roomname + "\n" + "Width of room = " + width + "\n" + "Height = " + hight + "\n"
				+ "Room members = " + roommembers + "\n";
	}
}
