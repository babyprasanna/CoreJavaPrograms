package oopsbasic;

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

		emp.emp_no = 12093022;
		emp.name = "Prasanna";
		emp.age = 23;
		emp.DOB = "20/Oct/1996";
		emp.work_role = "Software Developer";
		emp.Sal = 825984;
		emp.experience = 3;
		emp.joing_year = 2018;
		emp.permanent_Emp = true;
		emp.shifts = "Day";

		System.out.println("Employee Number : " + emp.emp_no + "\n" + "Employee Name : " + emp.name + "\n"
				+ "Employee Age : " + emp.age + "\n" + "Employee Date Of Birth : " + emp.DOB + "\n"
				+ "Employee Work Role : " + emp.work_role + "\n" + "Employee Salary : " + emp.Sal + "\n"
				+ "Employee Experience : " + emp.experience + "\n" + "Employee Joining Year : " + emp.joing_year + "\n"
				+ "Employee Permanent : " + emp.permanent_Emp + "\n" + "Employee Shift : " + emp.shifts + "\n");

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

		empdes.emp_no = 12093022;
		empdes.emp_name = "Prasanna";
		empdes.role = "Software Developer";
		empdes.designation_start_date = "10/02/2021";
		empdes.designation_end_date = "01/04/2021";
		empdes.Final_Settelment = 1240115;
		empdes.rating = 'A';
		empdes.max_sal = 25615848;
		empdes.min_sal = 9554824;
		empdes.basic_sal = 232165652;

		System.out.println("Employee No : " + empdes.emp_no + "\n" + "Name Of Employee : " + empdes.emp_name + "\n"
				+ "Employee Role : " + empdes.role + "\n" + "Employee Designation Start Date : "
				+ empdes.designation_start_date + "\n" + "Employee Designation End Date : "
				+ empdes.designation_end_date + "\n" + "Employee Final Settelment : " + empdes.Final_Settelment + "\n"
				+ "Employee Rating : " + empdes.rating + "\n" + "Max salary : " + empdes.max_sal + "\n"
				+ "Minimum Sal : " + empdes.min_sal + "\n" + "Basic Sal : " + empdes.basic_sal + "\n");

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

		emprole.Role_Name = "Software Developer";
		emprole.WorkPlatform = "Front End Developer";
		emprole.Technology = "Java";
		emprole.Project_Name = "Driver less car";
		emprole.start_Date = 2012;
		emprole.Dep_Name = "Builders";
		emprole.Team_Name = "Creaters";

		System.out.println("Rloe Name : " + emprole.Role_Name + "\n" + "Working Platform : " + emprole.WorkPlatform
				+ "\n" + "Technology : " + emprole.Technology + "\n" + "Project Name : " + emprole.Project_Name + "\n"
				+ "Start Date : " + emprole.start_Date + "\n" + "Depertement Name : " + emprole.Dep_Name + "\n"
				+ "Name Of Team : " + emprole.Team_Name + "\n");

	}

}
