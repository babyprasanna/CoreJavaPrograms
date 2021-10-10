package oops.getterssetters;

/**
 * This Class Contains Room Details
 * 
 * @author prasa
 *
 */

public class Room {

	private String roomname;
	private long width;
	private long hight;
	private long roommembers;

	public Room() {
	}

	public Room(String roomname, long width, long hight, long roommembers) {

		this.roomname = roomname;
		this.width = width;
		this.hight = hight;
		this.roommembers = roommembers;
	}

	public String getRoomname() {
		return roomname;
	}

	public void setRoomname(String roomname) {
		this.roomname = roomname;
	}

	public long getWidth() {
		return width;
	}

	public void setWidth(long width) {
		this.width = width;
	}

	public long getHight() {
		return hight;
	}

	public void setHight(long hight) {
		this.hight = hight;
	}

	public long getRoommembers() {
		return roommembers;
	}

	public void setRoommembers(long roommembers) {
		this.roommembers = roommembers;
	}

	public String toString() {

		return "Room Name = " + roomname + "\n" + "Width of room = " + width + "\n" + "Height = " + hight + "\n"
				+ "Room members = " + roommembers + "\n";

	}
}
