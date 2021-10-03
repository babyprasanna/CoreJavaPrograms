package oops.basic2;

/**
 * This Class Contains Employees_Designation Details
 * 
 * @author prasa
 *
 */
public class Employees_Designation {
	long emp_no;
	int experience;
	String designation_start_date = "DD/MM/YYYY";
	String designation_end_date = "DD/MM/YYYY";
	long Final_Settelment;
	char rating;
	long max_sal;
	long min_sal;
	long basic_sal;
	
	public String toString() {
		return "Employee Number = " + emp_no + "\n" + "Employee Experience = " + experience + "\n"
				+ " Designation Start Date = " + designation_start_date + "\n" + "designation End Date = "
				+ designation_end_date + "\n" + "Final Settelment = " + Final_Settelment + "\n"
				+ "Rating of Employee = " + rating + "\n" + "Maximum Sal = " + max_sal + "\n" + "Minimum Sal = "
				+ min_sal + "\n" + "Basic Sal = " + basic_sal + "\n";
	}

}
