package oops.basic2;

public class Students_Details_Main {

	/**
	 * This Class Contains Student_college_Details and Students_Branch,
	 * Students_Details and having Branch Details and College Details
	 * 
	 * 
	 * @author prasa
	 *
	 */
	public static void main(String[] args) {
		Students_Details sd = new Students_Details();

		sd.roll_no = 511;
		sd.name = "Rajendra.M";
		sd.year = 4;
		sd.semister = 2;
		sd.percentage = 69.5f;
		sd.jobholder = true;

		Students_Details sd1 = new Students_Details();

		sd1.roll_no = 505;
		sd1.name = "Prasanna.G";
		sd1.year = 3;
		sd1.semister = 1;
		sd1.percentage = 71.6f;
		sd1.jobholder = true;

		System.out.println(sd);
		System.out.println(sd1);

		Students_Branch studentbranch = new Students_Branch();

		studentbranch.branch_code = 5431;
		studentbranch.branch_name = "CSE";
		studentbranch.numberofsubjects = 6;

		System.out.println(studentbranch);

		Students_Branch studentbranch1 = new Students_Branch();

		studentbranch1.branch_code = 9841;
		studentbranch1.branch_name = "ECE";
		studentbranch1.numberofsubjects = 6;

		System.out.println(studentbranch1);

		Student_college_Details scd = new Student_college_Details();

		scd.college_code = 065;
		scd.college_name = "Sasi";
		scd.location = "Tadepalligudem";
		scd.noof_branchs = 6;
		scd.studentscount = 3594;

		System.out.println(scd);

		Student_college_Details scd1 = new Student_college_Details();

		scd1.college_code = 93;
		scd1.college_name = "Seetha";
		scd1.location = "Bhimavaram";
		scd1.noof_branchs = 9;
		scd1.studentscount = 29841;

		System.out.println(scd1);

		Branch cse = new Branch();

		cse.Branch_Code = 12093;
		cse.Branch_Name = "CSE";
		cse.Subject = "Java";
		cse.Student_Count = 2364;

		System.out.println(cse);

		College college = new College();

		college.privatecollege = true;
		college.govermentcollege = false;
		college.college_code = 226011;
		college.college_students_count = 236544;
		
		System.out.println(college);

		College college1 = new College();

		college.privatecollege = false;
		college.govermentcollege = true;
		college.college_code = 505511;
		college.college_students_count = 12644;

		System.out.println(college);
	}
}
