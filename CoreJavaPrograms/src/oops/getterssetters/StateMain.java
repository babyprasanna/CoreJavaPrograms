package oops.getterssetters;

/**
 * This Class Contains State and Town, Home and Room Details
 * 
 * @author prasa
 *
 */

public class StateMain {
	public static void main(String[] args) {

		Room hall = new Room();

		hall.setRoomname("Hall");
		hall.setWidth(36);
		hall.setHight(120);
		hall.setRoommembers(8);

		Room livingroom = new Room();

		livingroom.setRoomname("LivingRoom");
		livingroom.setWidth(39);
		livingroom.setHight(180);
		livingroom.setRoommembers(4);

		Home home = new Home();

		home.setHometype("Single House");
		home.setNameofhome("Sri Sai Livings");
		home.setArea("Hyderabad");
		home.setRoom(livingroom);

		Home home2 = new Home();

		home2.setHometype("Apartment");
		home2.setNameofhome("Best Livings And Joy Homes");
		home2.setArea("Tanuku");
		home2.setRoom(hall);

		Town town1 = new Town();

		town1.setTownname("Tanuku");
		town1.setCode(54222);
		town1.setHome(home);

		Town town2 = new Town();

		town2.setTownname("Velpur");
		town2.setCode(55221);
		town2.setHome(home2);

		State state1 = new State();

		state1.setCode(22511);
		state1.setStatename("WestGodavari");
		state1.setPeoplecount(855413);
		state1.setTown(town1);

		System.out.println(state1);

	}
}
