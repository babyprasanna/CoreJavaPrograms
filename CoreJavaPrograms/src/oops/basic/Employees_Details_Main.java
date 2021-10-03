package oops.basic;

/**
 * This Class Contains Employees_Details and Employees_Designation ,
 * Employee_Project
 * 
 * 
 * @author prasa
 *
 */
public class Employees_Details_Main {
	public static void main(String[] args) {
		Employees_Details emp_details = new Employees_Details();

		emp_details.name = "Prasanna.G";
		emp_details.emp_no = 22505;
		emp_details.role = "Software Developer";
		emp_details.projectname = "Driverless_car";
		emp_details.permanent_status = true;

		System.out.println(emp_details);

		Employees_Details emp_details1 = new Employees_Details();

		emp_details1.name = "Kumar Rajendra.M";
		emp_details1.emp_no = 60511;
		emp_details1.role = "Software Back End Developer";
		emp_details1.projectname = "Android task monitoring";
		emp_details1.permanent_status = true;

		System.out.println(emp_details1);

		Employees_Designation empdes = new Employees_Designation();

		empdes.emp_no = 1209360;
		empdes.experience = 3;
		empdes.designation_start_date = "01/01/2021";
		empdes.designation_end_date = "01/03/2021";
		empdes.Final_Settelment = 124115;
		empdes.rating = 'A';
		empdes.max_sal = 2569848;
		empdes.min_sal = 1954824;
		empdes.basic_sal = 22165652;

		System.out.println(empdes);

		Employees_Designation empdes1 = new Employees_Designation();

		empdes1.emp_no = 1565505;
		empdes1.experience = 2;
		empdes1.designation_start_date = "09/03/2020";
		empdes1.designation_end_date = "11/05/2020";
		empdes1.Final_Settelment = 216541;
		empdes1.rating = 'A';
		empdes1.max_sal = 2365498;
		empdes1.min_sal = 198215;
		empdes1.basic_sal = 5023169;

		System.out.println(empdes1);

		Employee_Project emp_project = new Employee_Project();

		emp_project.project_code = 511022;
		emp_project.project_name = "Android task monitoring";
		emp_project.team_name = "Active people";
		emp_project.team_members = 11;
		emp_project.start_date = "02/22/2020";
		emp_project.end_date = "03/20/2025";

		System.out.println(emp_project);

		Employee_Project emp_project1 = new Employee_Project();

		emp_project1.project_code = 60505;
		emp_project1.project_name = "Weather forecasting system";
		emp_project1.team_name = "Focuses";
		emp_project1.team_members = 39;
		emp_project1.start_date = "09/11/2020";
		emp_project1.end_date = "05/19/2095";

		System.out.println(emp_project1);
	}
}
