package oops.basic;

import java.util.*;
import java.util.Date;

public class EmployeeMain {
	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.empno = 12093060;
		emp.name = "Rajendra";
		emp.age = 24;
		emp.dob = "22/Nov/1996";
		emp.workrole = "Software Developer";
		emp.sal = 825884;
		emp.experience = 3;
		emp.joingyear = 2018;
		emp.permanentemp = true;
		emp.shifts = "Afternoon";

		System.out.println("Employee Number : " + emp.empno + "\n" + "Employee Name : " + emp.name + "\n"
				+ "Employee Age : " + emp.age + "\n" + "Employee Date Of Birth : " + emp.dob + "\n"
				+ "Employee Work Role : " + emp.workrole + "\n" + "Employee Salary : " + emp.sal + "\n"
				+ "Employee Experience : " + emp.experience + "\n" + "Employee Joining Year : " + emp.joingyear + "\n"
				+ "Employee Permanent : " + emp.permanentemp + "\n" + "Employee Shift : " + emp.shifts + "\n");

		Employee emp1 = new Employee();

		emp1.empno = 12093022;
		emp1.name = "Prasanna";
		emp1.age = 23;
		emp1.dob = "20/Oct/1996";
		emp1.workrole = "Software Developer";
		emp1.sal = 825984;
		emp1.experience = 3;
		emp1.joingyear = 2018;
		emp1.permanentemp = true;
		emp1.shifts = "Day";

		System.out.println("Employee Number : " + emp1.empno + "\n" + "Employee Name : " + emp1.name + "\n"
				+ "Employee Age : " + emp1.age + "\n" + "Employee Date Of Birth : " + emp1.dob + "\n"
				+ "Employee Work Role : " + emp1.workrole + "\n" + "Employee Salary : " + emp1.sal + "\n"
				+ "Employee Experience : " + emp1.experience + "\n" + "Employee Joining Year : " + emp1.joingyear + "\n"
				+ "Employee Permanent : " + emp1.permanentemp + "\n" + "Employee Shift : " + emp1.shifts + "\n");

		EmployeeDesignation empdes = new EmployeeDesignation();

		empdes.no = 1209360;
		empdes.name = "Rajendra";
		empdes.role = "Software Developer";
		empdes.startdate = "01/01/2021";
		empdes.enddate = "01/03/2021";
		empdes.finalsettelment = 124115;
		empdes.rating = 'A';
		empdes.maxsal = 2569848;
		empdes.minsal = 1954824;
		empdes.basicsal = 22165652;

		System.out.println("Employee No : " + empdes.no + "\n" + "Name Of Employee : " + empdes.name + "\n"
				+ "Employee Role : " + empdes.role + "\n" + "Employee Designation Start Date : " + empdes.startdate
				+ "\n" + "Employee Designation End Date : " + empdes.enddate + "\n" + "Employee Final Settelment : "
				+ empdes.finalsettelment + "\n" + "Employee Rating : " + empdes.rating + "\n" + "Max salary : "
				+ empdes.maxsal + "\n" + "Minimum Sal : " + empdes.minsal + "\n" + "Basic Sal : " + empdes.basicsal
				+ "\n");

		EmployeeDesignation empdes1 = new EmployeeDesignation();

		empdes1.no = 12093022;
		empdes1.name = "Prasanna";
		empdes1.role = "Software Developer";
		empdes1.startdate = "10/02/2021";
		empdes1.enddate = "01/04/2021";
		empdes1.finalsettelment = 1240115;
		empdes1.rating = 'A';
		empdes1.maxsal = 25615848;
		empdes1.minsal = 9554824;
		empdes1.basicsal = 232165652;

		System.out.println("Employee No : " + empdes1.no + "\n" + "Name Of Employee : " + empdes1.name + "\n"
				+ "Employee Role : " + empdes1.role + "\n" + "Employee Designation Start Date : " + empdes1.startdate
				+ "\n" + "Employee Designation End Date : " + empdes1.enddate + "\n" + "Employee Final Settelment : "
				+ empdes1.finalsettelment + "\n" + "Employee Rating : " + empdes1.rating + "\n" + "Max salary : "
				+ empdes1.maxsal + "\n" + "Minimum Sal : " + empdes1.minsal + "\n" + "Basic Sal : " + empdes1.basicsal
				+ "\n");

		EmployeeRole emprole = new EmployeeRole();

		emprole.rolename = "Software Developer";
		emprole.technology = "Java";
		emprole.projectname = "Driver less car";
		emprole.startdate = 2012;
		emprole.depname = "Developers";
		emprole.teamname = "Super Fast Track";

		System.out.println("Rloe Name : " + emprole.rolename + "\n" + "\n" + "Technology : " + emprole.technology + "\n"
				+ "Project Name : " + emprole.projectname + "\n" + "Start Date : " + emprole.startdate + "\n"
				+ "Depertement Name : " + emprole.depname + "\n" + "Name Of Team : " + emprole.teamname + "\n");

		EmployeeRole emprole1 = new EmployeeRole();

		emprole1.rolename = "Software Developer";
		emprole1.technology = "Java";
		emprole1.projectname = "Driver less car";
		emprole1.startdate = 2012;
		emprole1.depname = "Builders";
		emprole1.teamname = "Creaters";

		System.out.println("Rloe Name : " + emprole1.rolename + "\n" + "\n" + "Technology : " + emprole1.technology
				+ "\n" + "Project Name : " + emprole1.projectname + "\n" + "Start Date : " + emprole1.startdate + "\n"
				+ "Depertement Name : " + emprole1.depname + "\n" + "Name Of Team : " + emprole1.teamname + "\n");

	}

}
