package oops.classtostring;

import oops.basic.EmployeesProject;

/**
 * This Class Contains Designation and Employee ,Project Details
 * 
 * @author prasa
 *
 */

public class EmployeeMain {
	public static void main(String[] args) {

		Designation designations = new Designation();

		designations.experience = 2;
		designations.startdate = "12/06/2020";
		designations.enddate = "20/08/2020";
		designations.finalsettelment = 25644;
		designations.rating = 'A';
		designations.maxsal = 10365051;
		designations.minsal = 236441;
		designations.basicsal = 10365099;

		Employee employee = new Employee();

		employee.name = "Prasanna";
		employee.empno = 505022;
		employee.role = "Software Developer";
		employee.projectname = "Driver Less Car";
		employee.permanentstatus = true;
		employee.designation = designations;

		System.out.println(employee);

		Project empproject = new Project();

		empproject.projectcode = 511022;
		empproject.projectname = "Android task monitoring";
		empproject.teamname = "Active people";
		empproject.teammembers = 11;
		empproject.startdate = "02/22/2020";
		empproject.enddate = "03/20/2025";

		System.out.println(empproject);

	}
}
