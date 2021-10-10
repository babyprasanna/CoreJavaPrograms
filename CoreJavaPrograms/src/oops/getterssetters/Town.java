package oops.getterssetters;

/**
 * This Class Contains Town Details and Home Class
 * 
 * @author prasa
 *
 */

public class Town {

	private String townname;
	private long code;

	private Home home;

	public Town() {
	}

	public Town(String townname, long code) {
		this.townname = townname;
		this.code = code;
	}

	public String getTownname() {
		return townname;
	}

	public void setTownname(String townname) {
		this.townname = townname;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	public String toString() {

		return "Town Name = " + townname + "\n" + "Town Code = " + code + "\n" + "Homes = " + home + "\n";

	}

}
