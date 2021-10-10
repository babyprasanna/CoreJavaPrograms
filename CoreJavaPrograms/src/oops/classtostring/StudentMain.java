package oops.basic2;

/**
 * This Contains Students details and Branch, College
 * 
 * @author prasa
 *
 */

public class StudentMain {

	public static void main(String[] args) {

		Branch cse = new Branch();

		cse.branchcode = 2260;
		cse.branchname = "CSE";

		Students student = new Students();

		student.rollno = 1565505;
		student.name = "Prasanna";
		student.branch = cse;
		student.year = 4;
		student.semister = 1;
		student.percentage = 75.33f;
		student.jobholder = true;

		System.out.println(student);

		College college = new College();

		college.collegename = "Sasi";
		college.collegecode = 65;
		college.stundentscount = 6951;
		college.staffcount = 234;

		System.out.println(college);

	}
}
