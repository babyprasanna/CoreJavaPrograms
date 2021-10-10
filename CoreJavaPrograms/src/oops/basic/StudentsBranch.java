package oops.basic;

import java.util.ArrayList;

/**
 * This Class Contains Student sBranch Details
 * 
 * @author prasa
 *
 */

public class StudentsBranch {

	int branchcode;
	String branchname;
	long numberofsubjects;

	public String toString() {

		return "Branch Code = " + branchcode + "\n" + "Branch Name = " + branchname + "\n" + "Number of Subjects = "
				+ numberofsubjects + "\n";
	}
}
