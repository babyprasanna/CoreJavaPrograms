package oopsbasic;

import java.util.Date;

/**
 * This Class Having Details Of Student and Branch, College
 * 
 * @author prasa
 *
 */
public class Student_Details_Main {
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

		System.out.println("Regester Number : " + s1.reg_no + "\n " + " Year : " + s1.year + "\n " + " Date Of Birth : "
				+ s1.dateofbirth + "\n " + "Semister : " + s1.semester + " \n" + "Name : " + s1.name + " \n"
				+ "Surname : " + s1.Surname + "\n " + "Branch : " + s1.branch + " \n" + "Gender : " + s1.gender + " \n"
				+ "Percentag : " + s1.percentag + "\n " + "Garade : " + s1.grade + "\n " + "yearofpassedout : "
				+ s1.yearofpassedout + "\n " + "Jobholder : " + s1.Jobholder + " \n " + "Address : " + s1.Address
				+ "\n " + "Door No : " + s1.doorno + " \n" + "Mobilenumber : " + s1.mobilenumber + " ");

		s1.reg_no = 505;
		s1.year = 2015;
		s1.dateofbirth = "1996-Oct-20";
		s1.semester = 4;
		s1.name = " Prasanna ";
		s1.Surname = " G ";
		s1.branch = " CSE ";
		s1.gender = 'F';
		s1.percentag = 71;
		s1.grade = 'A';
		s1.yearofpassedout = 2015;
		s1.Jobholder = true;
		s1.Address = " Velpur ";
		s1.doorno = 22;
		s1.mobilenumber = 955809123;

		System.out.println("Regester Number : " + s1.reg_no + "\n " + " Year : " + s1.year + "\n " + " Date Of Birth : "
				+ s1.dateofbirth + "\n " + "Semister : " + s1.semester + " \n" + "Name : " + s1.name + " \n"
				+ "Surname : " + s1.Surname + "\n " + "Branch : " + s1.branch + " \n" + "Gender : " + s1.gender + " \n"
				+ "Percentag : " + s1.percentag + "\n " + "Garade : " + s1.grade + "\n " + "yearofpassedout : "
				+ s1.yearofpassedout + "\n " + "Jobholder : " + s1.Jobholder + " \n " + "Address : " + s1.Address
				+ "\n " + "Door No : " + s1.doorno + " \n" + "Mobilenumber : " + s1.mobilenumber + " ");

		s1.reg_no = 3;
		s1.year = 2014;
		s1.dateofbirth = "1995-July-30";
		s1.semester = 4;
		s1.name = " Rekha ";
		s1.Surname = " P ";
		s1.branch = " CSE ";
		s1.gender = 'F';
		s1.percentag = 82;
		s1.grade = 'A';
		s1.yearofpassedout = 2015;
		s1.Jobholder = true;
		s1.Address = "Hyderabad";
		s1.doorno = 339;
		s1.mobilenumber = 988612201;

		System.out.println("Regester Number : " + s1.reg_no + "\n " + " Year : " + s1.year + "\n " + " Date Of Birth : "
				+ s1.dateofbirth + "\n " + "Semister : " + s1.semester + " \n" + "Name : " + s1.name + " \n"
				+ "Surname : " + s1.Surname + "\n " + "Branch : " + s1.branch + " \n" + "Gender : " + s1.gender + " \n"
				+ "Percentag : " + s1.percentag + "\n " + "Garade : " + s1.grade + "\n " + "yearofpassedout : "
				+ s1.yearofpassedout + "\n " + "Jobholder : " + s1.Jobholder + " \n " + "Address : " + s1.Address
				+ "\n " + "Door No : " + s1.doorno + " \n" + "Mobilenumber : " + s1.mobilenumber + " ");

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
				+ b1.passstatus + "\n" + "Marks in Subject : " + b1.marks);

		b1.year = 4;
		b1.branch = "CSE";
		b1.name = "Rajendra";
		b1.rollno = 60;
		b1.subjects = "Java";
		b1.subjects = "WT";
		b1.subjects = "NetWorking";
		b1.Subjectname = "WT";
		b1.subjectpercentage = 92;
		b1.passstatus = true;
		b1.marks = 98.5;

		System.out.println("Year : " + b1.year + "\n" + "Branch : " + b1.branch + "\n" + "Name : " + b1.name + "\n"
				+ "Roll Number : " + b1.rollno + "\n" + "Subjects : " + b1.subjects + "\n" + "Subjectname : "
				+ b1.Subjectname + "\n" + "Subject Percentage : " + b1.subjectpercentage + "\n" + "Pass status : "
				+ b1.passstatus + "\n" + "Marks in Subject : " + b1.marks);

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
						+ c1.passedout_student_count + "\n" + "new_join_student_count : " + c1.new_join_student_count);

		c1.college_name = "seetha";
		c1.college_started_year = 1996;
		c1.college_code = 93;
		c1.branches = "CSE , ECE , EEE , Mech, IT";
		c1.total_students = 23126441;
		c1.faculity_count = 238;
		c1.buildings_count = 36;
		c1.passedout_student_count = 25232;
		c1.new_join_student_count = 23641;

		System.out
				.println("College_name : " + c1.college_name + "\n" + "College Stared Year : " + c1.college_started_year
						+ "\n" + "College Code : " + c1.college_code + "\n" + "branches : " + c1.branches + "\n"
						+ "total_students : " + c1.total_students + "\n" + "faculity_count : " + c1.faculity_count
						+ "\n" + "buildings_count : " + c1.buildings_count + "\n" + "passedout_student_count : "
						+ c1.passedout_student_count + "\n" + "new_join_student_count : " + c1.new_join_student_count);

	}

}
