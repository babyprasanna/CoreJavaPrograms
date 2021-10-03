package oops.basic2;

/**
 * This Class Contains Students_Branch Details
 * 
 * @author prasa
 *
 */
public class Students_Branch {
	int branch_code;
	String branch_name;
	long numberofsubjects;

	Branch branch;

	public String toString() {

		return "Branch Code = " + branch_code + "\n" + "Branch Name = " + branch_name + "\n" + "Number of Subjects = "
				+ numberofsubjects + "\n";
	}

}
