package oops.basicprograms;

import java.util.ArrayList;

/**
 * This Class Contains Branch And Student Details
 * 
 */

public class StudentMain {
	public static void main(String[] args) {

		Branch branch = new Branch(6001, "CSE", 1500, 1350);

		Branch branch1 = new Branch();

		branch1.setBranchcode(2214);
		branch1.setNameofbranch("ECE");
		branch1.setBranchstudentscount(14400);
		branch1.setPassedoutstudentscount(1310);

		Branch branch2 = new Branch(51160, "CSE", 1100, 890);
		Branch branch3 = new Branch(50522, "ECE", 1200, 1150);

		ArrayList<Branch> list = new ArrayList();

		list.add(branch);
		list.add(branch1);
		list.add(branch2);
		list.add(branch3);

		Student student1 = new Student();

		student1.setStudentid(90441);
		student1.setName("prasanna");
		student1.setGender("female");
		student1.setPercentage(71);
		student1.setGrade('A');
		student1.setBranch(branch1);

		Student student2 = new Student();

		student2.setStudentid(9961);
		student2.setName("rajendra");
		student2.setGender("male");
		student2.setPercentage(61);
		student2.setGrade('B');
		student2.setBranch(branch3);

		Student student3 = new Student();

		student3.setStudentid(8841);
		student3.setName("rekha");
		student3.setGender("female");
		student3.setPercentage(81);
		student3.setGrade('A');
		student3.setBranch(branch1);

		Student student4 = new Student();

		student4.setStudentid(5541);
		student4.setName("rani");
		student4.setGender("female");
		student4.setPercentage(79);
		student4.setGrade('A');
		student4.setBranch(branch2);

		ArrayList<Student> stu = new ArrayList();

		stu.add(student1);
		stu.add(student2);
		stu.add(student3);
		stu.add(student4);

		Branch br = null;
		long max = 0;
		for (Branch b : list) {
			if (b.getPassedoutstudentscount() > max) {
				max = b.getPassedoutstudentscount();
				br = b;
			}
		}
		System.out.println("Maximum Passed Outs : " + br);
		Branch br1 = null;

		for (Branch b1 : list) {
			if (b1.getBranchstudentscount() > max) {
				max = b1.getBranchstudentscount();
				br1 = b1;
			}
		}
		System.out.println("Maximum students : " + br1);

		int count = 0;

		for (Branch b2 : list) {
			if (b2.getNameofbranch().equals("ECE")) {
				count++;
			}
		}
		System.out.println("ECE Branch Count is : " + count);

		Student st1 = null;
		double maximum = 0;
		for (Student s1 : stu) {
			if (s1.getPercentage() > maximum) {

				maximum = s1.getPercentage();
				st1 = s1;
			}
		}
		System.out.println("Minimum percentage of Student is : " + st1);

		int countgrada = 0;
		int countgradb = 0;

		for (Student grd : stu) {
			if (grd.getGrade() == 'A') {
				countgrada++;
			} else {
				countgradb++;
			}
		}
		System.out.println("Grades Of A Students Count is : " + countgrada + "\t Grades Of B Students count is : " + countgradb);

		int countbrn = 0;
		int countbrn1 = 0;

		for (Branch brn : list) {
			if (brn.getNameofbranch().equals("CSE")) {
				countbrn++;
			} else {
				countbrn1++;
			}
		}
		System.out.println("No.Of CSE Branchs : " + countbrn + "\t Other Branch Count is : " + countbrn1);

		int gendercount1 = 0;
		int gendercount2 = 0;

		for (Student gnd : stu) {
			if (gnd.getGender().equals("male")) {
				gendercount1++;
			} else {
				gendercount2++;
			}
		}
		System.out.println("Male Student count is : " + gendercount1 + "\nFemale Students Count is : " + gendercount2);

		int countgrdstu1 = 0;
		int countgrdstu2 = 0;

		for (Student grdstu : stu) {
			if (grdstu.getPercentage() > 70) {
				countgrdstu1++;
			} else {
				countgrdstu2++;
			}
		}
		System.out.println("High Percentage Student Count is : " + countgrdstu1
				+ "\nBelow 70 percentage Student count is : " + countgrdstu2);

	}
}