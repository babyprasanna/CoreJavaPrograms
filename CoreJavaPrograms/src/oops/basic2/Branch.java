package oops.basic2;

/**
 * This Class Contains Branch details
 * 
 * @author prasa
 *
 */

public class Branch {

	int Branch_Code;
	String Branch_Name;
	String Subject;
	long Student_Count;

	public String toString() {
		return "Branch Code = " + Branch_Code + "\n" + "Branch Name = " + Branch_Name + "\n" + "Subject Name = "
				+ Subject + "\n" + "Students Count = " + Student_Count + "\n";
	}

}
