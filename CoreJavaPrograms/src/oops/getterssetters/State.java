package oops.getterssetters;

/**
 * This Class Contains State Details and Town Class
 * 
 * @author prasa
 *
 */

public class State {

	private long code;
	private String statename;
	private long peoplecount;

	private Town town;

	public State() {
	}

	public State(long code, String statename, long peoplecount) {

		this.code = code;
		this.statename = statename;
		this.peoplecount = peoplecount;
	}

	public long getCode() {
		return code;
	}

	public void setCode(long code) {
		this.code = code;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public long getPeoplecount() {
		return peoplecount;
	}

	public void setPeoplecount(long peoplecount) {
		this.peoplecount = peoplecount;
	}

	public Town getTown() {
		return town;
	}

	public void setTown(Town town) {
		this.town = town;
	}

	public String toString() {

		return "State Code = " + code + "\n" + "State Name = " + statename + "\n" + "People Count = " + peoplecount
				+ "\n" + "Town = " + town + "\n";
	}
}
