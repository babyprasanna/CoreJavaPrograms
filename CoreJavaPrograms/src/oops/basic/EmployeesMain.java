package oops.basic;

/**
 * This Class Contains Employees Details and Employees Designation , Employee
 * Project
 * 
 * 
 * @author prasa
 *
 */
public class EmployeesMain {
	public static void main(String[] args) {
		EmployeesDetails empdetails = new EmployeesDetails();

		empdetails.name = "Prasanna.G";
		empdetails.empno = 22505;
		empdetails.role = "Software Developer";
		empdetails.projectname = "Driverless_car";
		empdetails.permanentstatus = true;

		System.out.println(empdetails);

		EmployeesDetails empdetails1 = new EmployeesDetails();

		empdetails1.name = "Kumar Rajendra.M";
		empdetails1.empno = 60511;
		empdetails1.role = "Software Back End Developer";
		empdetails1.projectname = "Android task monitoring";
		empdetails1.permanentstatus = true;

		System.out.println(empdetails1);

		EmployeesDesignation empdes = new EmployeesDesignation();

		empdes.empno = 1209360;
		empdes.experience = 3;
		empdes.startdate = "01/01/2021";
		empdes.enddate = "01/03/2021";
		empdes.finalsettelment = 124115;
		empdes.rating = 'A';
		empdes.maxsal = 2569848;
		empdes.minsal = 1954824;
		empdes.basicsal = 22165652;

		System.out.println(empdes);

		EmployeesDesignation empdes1 = new EmployeesDesignation();

		empdes1.empno = 1565505;
		empdes1.experience = 2;
		empdes1.startdate = "09/03/2020";
		empdes1.enddate = "11/05/2020";
		empdes1.finalsettelment = 216541;
		empdes1.rating = 'A';
		empdes1.maxsal = 2365498;
		empdes1.minsal = 198215;
		empdes1.basicsal = 5023169;

		System.out.println(empdes1);

		EmployeesProject empproject = new EmployeesProject();

		empproject.projectcode = 511022;
		empproject.projectname = "Android task monitoring";
		empproject.teamname = "Active people";
		empproject.teammembers = 11;
		empproject.startdate = "02/22/2020";
		empproject.enddate = "03/20/2025";

		System.out.println(empproject);

		EmployeesProject empproject1 = new EmployeesProject();

		empproject1.projectcode = 60505;
		empproject1.projectname = "Weather forecasting system";
		empproject1.teamname = "Focuses";
		empproject1.teammembers = 39;
		empproject1.startdate = "09/11/2020";
		empproject1.enddate = "05/19/2095";

		System.out.println(empproject1);
	}
}
