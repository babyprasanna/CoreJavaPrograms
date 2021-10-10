package oops.getterssetters;

/**
 * This Class Contains Home Details And Room Class
 * 
 * @author prasa
 *
 */

public class Home {

	private String hometype;
	private String nameofhome;
	private String area;

	private Room room;

	public Home() {
	}

	public Home(String hometype, String nameofhome, String area) {
		this.hometype = hometype;
		this.nameofhome = nameofhome;
		this.area = area;
	}

	public String getHometype() {
		return hometype;
	}

	public void setHometype(String hometype) {
		this.hometype = hometype;
	}

	public String getNameofhome() {
		return nameofhome;
	}

	public void setNameofhome(String nameofhome) {
		this.nameofhome = nameofhome;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public String toString() {

		return "Home Type = " + hometype + "\n" + "Name Of Home = " + nameofhome + "\n" + "Area = " + area + "\n"
				+ "Rooms in Home = " + room + "\n";

	}
}
