package oops.basic;

import java.util.ArrayList;

/**
 * This Class Contains Student_College and Students_Branch,
 * Students_Details
 * 
 * 
 * @author prasa
 *
 */
public class StudentsMain {

	public static void main(String[] args) {
		StudentsDetails sd = new StudentsDetails();

		sd.rollno = 511;
		sd.name = "Rajendra.M";
		sd.year = 4;
		sd.semister = 2;
		sd.percentage = 69.5f;
		sd.jobholder = true;

		StudentsDetails sd1 = new StudentsDetails();

		sd1.rollno = 505;
		sd1.name = "Prasanna.G";
		sd1.year = 3;
		sd1.semister = 1;
		sd1.percentage = 71.6f;
		sd1.jobholder = true;

		System.out.println(sd);
		System.out.println(sd1);

		StudentsBranch studentbranch = new StudentsBranch();

		studentbranch.branchcode = 5431;
		studentbranch.branchname = "CSE";
		studentbranch.numberofsubjects = 6;

		System.out.println(studentbranch);

		StudentsBranch studentbranch1 = new StudentsBranch();

		studentbranch1.branchcode = 9841;
		studentbranch1.branchname = "ECE";
		studentbranch1.numberofsubjects = 6;

		System.out.println(studentbranch1);

		StudentCollege scd = new StudentCollege();

		scd.collegecode = 065;
		scd.collegename = "Sasi";
		scd.location = "Tadepalligudem";
		scd.branchs = 6;
		scd.studentscount = 3594;

		System.out.println(scd);

		StudentCollege scd1 = new StudentCollege();

		scd1.collegecode = 93;
		scd1.collegename = "Seetha";
		scd1.location = "Bhimavaram";
		scd1.branchs = 9;
		scd1.studentscount = 29841;

		System.out.println(scd1);

	}
}
