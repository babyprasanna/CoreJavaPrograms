package oops.basic3;

/**
 * This Class Contains College and Branch , Teacher and Student Details
 * 
 * @author prasa
 * 
 */

import java.util.ArrayList;

public class CollegeMain {
	public static void main(String[] args) {

		Branch cse = new Branch();

		cse.branchcode = 022;
		cse.nameofbranch = "CSE";
		cse.branchstudentscount = 2251;
		cse.passedoutstudentscount = 2210;

		Branch ece = new Branch();

		ece.branchcode = 511;
		ece.nameofbranch = "ECE";
		ece.branchstudentscount = 1251;
		ece.passedoutstudentscount = 1211;

		ArrayList<Branch> branches = new ArrayList();

		branches.add(cse);
		branches.add(ece);

		Branch eee = new Branch();

		eee.branchcode = 505;
		eee.nameofbranch = "EEE";
		eee.branchstudentscount = 2491;
		eee.passedoutstudentscount = 2011;

		ArrayList<Branch> branches1 = new ArrayList();

		branches1.add(cse);
		branches1.add(ece);
		branches1.add(eee);

		college sasi = new college();

		sasi.collegecode = 1565;
		sasi.collegename = "Sasi Institute of Technology and Engineering";
		sasi.studentcount = 5664;
		sasi.buildingscount = 9;
		sasi.branch = branches;

		System.out.println(sasi);

		college seetha = new college();

		seetha.collegecode = 93;
		seetha.collegename = "Smt B.Seetha Polytechnic";
		seetha.studentcount = 9464;
		seetha.buildingscount = 4;
		seetha.branch = branches1;

		System.out.println(seetha);

		Student student1 = new Student();

		student1.collegenameofstudent = "Prasanna G";
		student1.studentid = 022505;
		student1.branch = "CSE";
		student1.sem = 2;
		student1.year = 4;
		student1.percentage = 75.59f;

		Student student2 = new Student();

		student2.collegenameofstudent = "Rekha P";
		student2.studentid = 2619;
		student2.branch = "ECE";
		student2.sem = 2;
		student2.year = 3;
		student2.percentage = 81.01f;

		Student student3 = new Student();

		student3.collegenameofstudent = "Rajendra A";
		student3.studentid = 60511;
		student3.branch = "CSE";
		student3.sem = 1;
		student3.year = 4;
		student3.percentage = 65.19f;

		ArrayList<Student> studeatils1 = new ArrayList();

		studeatils1.add(student1);
		studeatils1.add(student3);

		ArrayList<Student> studeatils2 = new ArrayList();

		studeatils2.add(student1);
		studeatils2.add(student2);
		studeatils2.add(student3);

		Teacher teacher1 = new Teacher();

		teacher1.teacherid = 8841;
		teacher1.teachersubject = "Java";
		teacher1.subsubject = "C++";
		teacher1.noofclasses = 3;
		teacher1.student = studeatils1;

		System.out.println(teacher1);

		Teacher teacher2 = new Teacher();

		teacher2.teacherid = 9514;
		teacher2.teachersubject = "Maths-1";
		teacher2.subsubject = "Maths-2";
		teacher2.noofclasses = 5;
		teacher2.student = studeatils2;

		System.out.println(teacher2);
	}
}
