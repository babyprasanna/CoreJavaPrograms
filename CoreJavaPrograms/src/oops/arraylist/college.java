package oops.arraylist;

/**
 * This Class Contains College Details and Branch Class
 * 
 * @author prasa
 * 
 */

import java.util.ArrayList;

public class college {

	long collegecode;
	String collegename;
	long studentcount;
	long buildingscount;

	ArrayList<Branch> branch;

	public String toString() {

		return "College Code = " + collegecode + "\n" + "College Name = " + collegename + "Students Count = "
				+ studentcount + "\n" + "No.Of Buildings" + +buildingscount + "\n" + "Branches is : " + branch + "\n";

	}
}
