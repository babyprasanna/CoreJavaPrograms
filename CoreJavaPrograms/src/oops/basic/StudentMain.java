package oops.basic;

import java.util.Date;

/**
 * This Class Having Details Of Student and Branch, College
 * 
 * @author prasa
 *
 */
public class StudentMain {
	public static void main(String[] args) {
		Student s1 = new Student();

		s1.reg_no = 511;
		s1.year = 2015;
		s1.dateofbirth = "1995-Nov-22";
		s1.semester = 4;
		s1.name = " Rajendra ";
		s1.Surname = " M ";
		s1.branch = " CSE ";
		s1.gender = 'M';
		s1.percentag = 72;
		s1.grade = 'A';
		s1.yearofpassedout = 2015;
		s1.Jobholder = true;
		s1.Address = " Undarajavaram ";
		s1.doorno = 60;
		s1.mobilenumber = 868851185;

		System.out.println("Regester Number : " + s1.reg_no + "\n" + "Year : " + s1.year + "\n" + "Date Of Birth : "
				+ s1.dateofbirth + "\n" + "Semister : " + s1.semester + "\n" + "Name : " + s1.name + "\n"
				+ "Surname : " + s1.Surname + "\n" + "Branch : " + s1.branch + "\n" + "Gender : " + s1.gender + "\n"
				+ "Percentag : " + s1.percentag + "\n" + "Garade : " + s1.grade + "\n" + "yearofpassedout : "
				+ s1.yearofpassedout + "\n" + "Jobholder : " + s1.Jobholder + "\n" + "Address : " + s1.Address
				+ "\n" + "Door No : " + s1.doorno + "\n" + "Mobilenumber : " + s1.mobilenumber + " " + "\n");

		Student s2 = new Student();

		s2.reg_no = 505;
		s2.year = 2015;
		s2.dateofbirth = "1996-Oct-20";
		s2.semester = 4;
		s2.name = " Prasanna ";
		s2.Surname = " G ";
		s2.branch = " CSE ";
		s2.gender = 'F';
		s2.percentag = 71;
		s2.grade = 'A';
		s2.yearofpassedout = 2015;
		s2.Jobholder = true;
		s2.Address = " Velpur ";
		s2.doorno = 22;
		s2.mobilenumber = 955809123;

		System.out.println("Regester Number : " + s2.reg_no + "\n" + "Year : " + s2.year + "\n" + "Date Of Birth : "
				+ s2.dateofbirth + "\n" + "Semister : " + s2.semester + "\n" + "Name : " + s2.name + "\n"
				+ "Surname : " + s2.Surname + "\n" + "Branch : " + s2.branch + "\n" + "Gender : " + s2.gender + "\n"
				+ "Percentag : " + s2.percentag + "\n" + "Garade : " + s2.grade + "\n" + "yearofpassedout : "
				+ s2.yearofpassedout + "\n" + "Jobholder : " + s2.Jobholder + "\n" + "Address : " + s2.Address
				+ "\n" + "Door No : " + s2.doorno + "\n" + "Mobilenumber : " + s2.mobilenumber + " " + "\n");

		Student s3 = new Student();

		s3.reg_no = 3;
		s3.year = 2014;
		s3.dateofbirth = "1995-July-30";
		s3.semester = 4;
		s3.name = " Rekha ";
		s3.Surname = " P ";
		s3.branch = " CSE ";
		s3.gender = 'F';
		s3.percentag = 82;
		s3.grade = 'A';
		s3.yearofpassedout = 2015;
		s3.Jobholder = true;
		s3.Address = "Hyderabad";
		s3.doorno = 339;
		s3.mobilenumber = 988612201;

		System.out.println("Regester Number : " + s3.reg_no + "\n" + "Year : " + s3.year + "\n" + "Date Of Birth : "
				+ s3.dateofbirth + "\n" + "Semister : " + s3.semester + "\n" + "Name : " + s3.name + "\n"
				+ "Surname : " + s3.Surname + "\n" + "Branch : " + s3.branch + "\n" + "Gender : " + s3.gender + "\n"
				+ "Percentag : " + s3.percentag + "\n" + "Garade : " + s3.grade + "\n" + "yearofpassedout : "
				+ s3.yearofpassedout + "\n" + "Jobholder : " + s3.Jobholder + "\n" + "Address : " + s3.Address
				+ "\n" + "Door No : " + s3.doorno + "\n" + "Mobilenumber : " + s3.mobilenumber + " " + "\n");

		Branch b1 = new Branch();

		b1.year = 3;
		b1.branch = "CSE";
		b1.name = "Prasanna";
		b1.rollno = 22;
		b1.subjects = "Java";
		b1.subjects = "WT";
		b1.subjects = "NetWorking";
		b1.Subjectname = "Java";
		b1.subjectpercentage = 82;
		b1.passstatus = true;
		b1.marks = 96.5;

		System.out.println("Year : " + b1.year + "\n" + "Branch : " + b1.branch + "\n" + "Name : " + b1.name + "\n"
				+ "Roll Number : " + b1.rollno + "\n" + "Subjects : " + b1.subjects + "\n" + "Subjectname : "
				+ b1.Subjectname + "\n" + "Subject Percentage : " + b1.subjectpercentage + "\n" + "Pass status : "
				+ b1.passstatus + "\n" + "Marks in Subject : " + b1.marks + "\n");

		Branch b2 = new Branch();

		b2.year = 4;
		b2.branch = "CSE";
		b2.name = "Rajendra";
		b2.rollno = 60;
		b2.subjects = "Java";
		b2.subjects = "WT";
		b2.subjects = "NetWorking";
		b2.Subjectname = "WT";
		b2.subjectpercentage = 92;
		b2.passstatus = true;
		b2.marks = 98.5;

		System.out.println("Year : " + b2.year + "\n" + "Branch : " + b2.branch + "\n" + "Name : " + b2.name + "\n"
				+ "Roll Number : " + b2.rollno + "\n" + "Subjects : " + b2.subjects + "\n" + "Subjectname : "
				+ b2.Subjectname + "\n" + "Subject Percentage : " + b2.subjectpercentage + "\n" + "Pass status : "
				+ b2.passstatus + "\n" + "Marks in Subject : " + b2.marks + "\n");

		College c1 = new College();
		c1.college_name = "Sasi";
		c1.college_started_year = 2012;
		c1.college_code = 65;
		c1.branches = "CSE , ECE , EEE , Mech, IT";
		c1.total_students = 2341;
		c1.faculity_count = 238;
		c1.buildings_count = 9;
		c1.passedout_student_count = 2332;
		c1.new_join_student_count = 2341;

		System.out
				.println("College_name : " + c1.college_name + "\n" + "College Stared Year : " + c1.college_started_year
						+ "\n" + "College Code : " + c1.college_code + "\n" + "branches : " + c1.branches + "\n"
						+ "total_students : " + c1.total_students + "\n" + "faculity_count : " + c1.faculity_count
						+ "\n" + "buildings_count : " + c1.buildings_count + "\n" + "passedout_student_count : "
						+ c1.passedout_student_count + "\n" + "new_join_student_count : " + c1.new_join_student_count + "\n");

		College c2 = new College();

		c2.college_name = "seetha";
		c2.college_started_year = 1996;
		c2.college_code = 93;
		c2.branches = "CSE , ECE , EEE , Mech, IT";
		c2.total_students = 23126441;
		c2.faculity_count = 238;
		c2.buildings_count = 36;
		c2.passedout_student_count = 25232;
		c2.new_join_student_count = 23641;

		System.out
				.println("College_name : " + c2.college_name + "\n" + "College Stared Year : " + c2.college_started_year
						+ "\n" + "College Code : " + c2.college_code + "\n" + "branches : " + c2.branches + "\n"
						+ "total_students : " + c2.total_students + "\n" + "faculity_count : " + c2.faculity_count
						+ "\n" + "buildings_count : " + c2.buildings_count + "\n" + "passedout_student_count : "
						+ c2.passedout_student_count + "\n" + "new_join_student_count : " + c2.new_join_student_count + "\n");

	}

}
