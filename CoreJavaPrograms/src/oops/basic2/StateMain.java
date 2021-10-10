package oops.basic2;

/**
 * This Class Contains State and Town and Home , Room Details
 * 
 * @author prasa
 *
 */

public class StateMain {

	public static void main(String[] args) {

		Room room = new Room();

		room.roomname = "Hall";
		room.width = 136;
		room.hight = 120;
		room.roommembers = 8;

		Home home = new Home();
		home.hometype = "Apartment";
		home.nameofhome = "Sri Sai Lives";
		home.area = "Hyderabad";
		home.room = room;

		Town town = new Town();

		town.townname = "Tanuku";
		town.code = 54222;
		town.home = home;

		State state = new State();

		state.code = 23664;
		state.statename = "Andhra";
		state.peoplecount = 2699541;
		state.town = town;

		System.out.println(state);

	}
}
