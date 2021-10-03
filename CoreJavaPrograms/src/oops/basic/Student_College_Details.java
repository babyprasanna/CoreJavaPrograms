package oops.basic;

public class Student_College_Details {

	long college_code;
	String college_name;
	String location;
	long noof_branchs;
	long studentscount;

	public String toString() {

		return "College Code = " + college_code + "\n" + "Coallege Name : " + college_name + "\n"
				+ "College Loacation = " + location + "\n" + "Branches = " + noof_branchs + "\n"
				+ "No.Of Students in College = " + studentscount + "\n";

		
	}
}
