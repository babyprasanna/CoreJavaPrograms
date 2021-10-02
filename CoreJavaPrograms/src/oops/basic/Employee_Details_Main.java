package oops.basic;

import java.util.*;
import java.util.Date;

public class Employee_Details_Main {
	public static void main(String[] args) {
		Employee emp = new Employee();

		emp.emp_no = 12093060;
		emp.name = "Rajendra";
		emp.age = 24;
		emp.DOB = "22/Nov/1996";
		emp.work_role = "Software Developer";
		emp.Sal = 825884;
		emp.experience = 3;
		emp.joing_year = 2018;
		emp.permanent_Emp = true;
		emp.shifts = "Afternoon";

		System.out.println("Employee Number : " + emp.emp_no + "\n" + "Employee Name : " + emp.name + "\n"
				+ "Employee Age : " + emp.age + "\n" + "Employee Date Of Birth : " + emp.DOB + "\n"
				+ "Employee Work Role : " + emp.work_role + "\n" + "Employee Salary : " + emp.Sal + "\n"
				+ "Employee Experience : " + emp.experience + "\n" + "Employee Joining Year : " + emp.joing_year + "\n"
				+ "Employee Permanent : " + emp.permanent_Emp + "\n" + "Employee Shift : " + emp.shifts + "\n");
		
		
		Employee emp1 = new Employee();

		emp1.emp_no = 12093022;
		emp1.name = "Prasanna";
		emp1.age = 23;
		emp1.DOB = "20/Oct/1996";
		emp1.work_role = "Software Developer";
		emp1.Sal = 825984;
		emp1.experience = 3;
		emp1.joing_year = 2018;
		emp1.permanent_Emp = true;
		emp1.shifts = "Day";

		System.out.println("Employee Number : " + emp1.emp_no + "\n" + "Employee Name : " + emp1.name + "\n"
				+ "Employee Age : " + emp1.age + "\n" + "Employee Date Of Birth : " + emp1.DOB + "\n"
				+ "Employee Work Role : " + emp1.work_role + "\n" + "Employee Salary : " + emp1.Sal + "\n"
				+ "Employee Experience : " + emp1.experience + "\n" + "Employee Joining Year : " + emp1.joing_year + "\n"
				+ "Employee Permanent : " + emp1.permanent_Emp + "\n" + "Employee Shift : " + emp1.shifts + "\n");

		
		Employee_Designation empdes = new Employee_Designation();

		empdes.emp_no = 1209360;
		empdes.emp_name = "Rajendra";
		empdes.role = "Software Developer";
		empdes.designation_start_date = "01/01/2021";
		empdes.designation_end_date = "01/03/2021";
		empdes.Final_Settelment = 124115;
		empdes.rating = 'A';
		empdes.max_sal = 2569848;
		empdes.min_sal = 1954824;
		empdes.basic_sal = 22165652;

		System.out.println("Employee No : " + empdes.emp_no + "\n" + "Name Of Employee : " + empdes.emp_name + "\n"
				+ "Employee Role : " + empdes.role + "\n" + "Employee Designation Start Date : "
				+ empdes.designation_start_date + "\n" + "Employee Designation End Date : "
				+ empdes.designation_end_date + "\n" + "Employee Final Settelment : " + empdes.Final_Settelment + "\n"
				+ "Employee Rating : " + empdes.rating + "\n" + "Max salary : " + empdes.max_sal + "\n"
				+ "Minimum Sal : " + empdes.min_sal + "\n" + "Basic Sal : " + empdes.basic_sal + "\n");
		
		Employee_Designation empdes1 = new Employee_Designation();

		empdes1.emp_no = 12093022;
		empdes1.emp_name = "Prasanna";
		empdes1.role = "Software Developer";
		empdes1.designation_start_date = "10/02/2021";
		empdes1.designation_end_date = "01/04/2021";
		empdes1.Final_Settelment = 1240115;
		empdes1.rating = 'A';
		empdes1.max_sal = 25615848;
		empdes1.min_sal = 9554824;
		empdes1.basic_sal = 232165652;

		System.out.println("Employee No : " + empdes1.emp_no + "\n" + "Name Of Employee : " + empdes1.emp_name + "\n"
				+ "Employee Role : " + empdes1.role + "\n" + "Employee Designation Start Date : "
				+ empdes1.designation_start_date + "\n" + "Employee Designation End Date : "
				+ empdes1.designation_end_date + "\n" + "Employee Final Settelment : " + empdes1.Final_Settelment + "\n"
				+ "Employee Rating : " + empdes1.rating + "\n" + "Max salary : " + empdes1.max_sal + "\n"
				+ "Minimum Sal : " + empdes1.min_sal + "\n" + "Basic Sal : " + empdes1.basic_sal + "\n");

		Employee_Role_Details emprole = new Employee_Role_Details();

		emprole.Role_Name = "Software Developer";
		emprole.WorkPlatform = "Back End Developer";
		emprole.Technology = "Java";
		emprole.Project_Name = "Driver less car";
		emprole.start_Date = 2012;
		emprole.Dep_Name = "Developers";
		emprole.Team_Name = "Super Fast Track";

		System.out.println("Rloe Name : " + emprole.Role_Name + "\n" + "Working Platform : " + emprole.WorkPlatform
				+ "\n" + "Technology : " + emprole.Technology + "\n" + "Project Name : " + emprole.Project_Name + "\n"
				+ "Start Date : " + emprole.start_Date + "\n" + "Depertement Name : " + emprole.Dep_Name + "\n"
				+ "Name Of Team : " + emprole.Team_Name + "\n");
		
		Employee_Role_Details emprole1 = new Employee_Role_Details();

		emprole1.Role_Name = "Software Developer";
		emprole1.WorkPlatform = "Front End Developer";
		emprole1.Technology = "Java";
		emprole1.Project_Name = "Driver less car";
		emprole1.start_Date = 2012;
		emprole1.Dep_Name = "Builders";
		emprole1.Team_Name = "Creaters";

		System.out.println("Rloe Name : " + emprole1.Role_Name + "\n" + "Working Platform : " + emprole1.WorkPlatform
				+ "\n" + "Technology : " + emprole1.Technology + "\n" + "Project Name : " + emprole1.Project_Name + "\n"
				+ "Start Date : " + emprole1.start_Date + "\n" + "Depertement Name : " + emprole1.Dep_Name + "\n"
				+ "Name Of Team : " + emprole1.Team_Name + "\n");

	}

}
