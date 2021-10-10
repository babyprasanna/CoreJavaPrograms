package oops.basic3;

import java.util.ArrayList;

public class StatesMain {

	public static void main(String[] args) {

		Room hall = new Room();

		hall.roomname = "Hall";
		hall.width = 36;
		hall.hight = 120;
		hall.roommembers = 8;

		Room livingroom = new Room();

		livingroom.roomname = "LivingRoom";
		livingroom.width = 39;
		livingroom.hight = 180;
		livingroom.roommembers = 4;

		Room kitchen = new Room();

		kitchen.roomname = "Kitchen Room";
		kitchen.width = 29;
		kitchen.hight = 150;
		kitchen.roommembers = 2;

		ArrayList<Room> list = new ArrayList();

		list.add(hall);
		list.add(livingroom);

		ArrayList<Room> list1 = new ArrayList();

		list1.add(hall);
		list1.add(livingroom);
		list1.add(kitchen);

		Home home = new Home();

		home.hometype = "Single House";
		home.nameofhome = "Sri Sai Livings";
		home.area = "Hyderabad";
		home.room = list;

		System.out.println(home);

		Home home2 = new Home();

		home2.hometype = "Apartment";
		home2.nameofhome = "Best Livings And Joy Homes";
		home2.area = "Tanuku";
		home2.room = list1;

		System.out.println(home2);

		Town town1 = new Town();

		town1.townname = "Tanuku";
		town1.code = 54222;

		Town town2 = new Town();

		town2.townname = "Velpur";
		town2.code = 55221;
		
		Town town3 = new Town();

		town3.townname = "Undarajavaram";
		town3.code = 55221;

		ArrayList<Town> townslist = new ArrayList();

		townslist.add(town1);
		townslist.add(town2);

		State state1 = new State();

		state1.code = 22511;
		state1.statename = "WestGodavari";
		state1.peoplecount = 855413;
		state1.town = townslist;

		System.out.println(state1);
		
		ArrayList<Town> townslist1 = new ArrayList();

		townslist1.add(town1);
		townslist1.add(town2);
		townslist1.add(town3);

		State state2 = new State();

		state2.code = 21149;
		state2.statename = "East Godavari";
		state2.peoplecount = 54413;
		state2.town = townslist1;
		state2.town = townslist1;

		System.out.println(state2);

	}
}
