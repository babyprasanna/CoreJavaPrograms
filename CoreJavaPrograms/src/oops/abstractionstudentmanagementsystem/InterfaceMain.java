package oops.abstractionstudentmanagementsystem;

/**
 * This Class Contains studentOperations and branchOperations
 */

import java.util.ArrayList;

public class InterfaceMain {
	public static void main(String[] args) {

		StudentOperations1 studentOperations1 = new StudentBuilder1();
		BranchOperations1 branchOperations1 = new BranchBuilder1();

		College sasi = new College();

		sasi.setClgcode(5541);
		sasi.setClgname("sasi");
		sasi.setClglocation("tpg");

		College seetha = new College();

		sasi.setClgcode(2114);
		sasi.setClgname("seetha");
		sasi.setClglocation("bvrm");

		College vishnu = new College();

		sasi.setClgcode(9412);
		sasi.setClgname("vishnu");
		sasi.setClglocation("bvrm");

		ArrayList<College> collegelist = new ArrayList<>();
		collegelist.add(sasi);
		collegelist.add(seetha);
		collegelist.add(vishnu);

		Branch br1 = new Branch();

		br1.setId(1);
		br1.setBranchname("cse");

		Branch br2 = new Branch();

		br2.setId(2);
		br2.setBranchname("ece");

		Branch br3 = new Branch();

		br3.setId(3);
		br3.setBranchname("eee");

		Branch br4 = new Branch();

		br4.setId(4);
		br4.setBranchname("it");

		branchOperations1.addBranch(br1);
		branchOperations1.addBranch(br2);
		branchOperations1.addBranch(br3);
		branchOperations1.addBranch(br4);

		Student std1 = new Student();

		std1.setId(22);
		std1.setName("prasanna");
		std1.setGender("female");
		std1.setPercentage(75);
		std1.setGrade('A');
		std1.setBranch(br1);

		Student std2 = new Student();

		std2.setId(60);
		std2.setName("rajaendra");
		std2.setGender("male");
		std2.setPercentage(68);
		std2.setGrade('B');
		std2.setBranch(br2);

		Student std3 = new Student();

		std3.setId(21);
		std3.setName("rekha");
		std3.setGender("female");
		std3.setPercentage(81);
		std3.setGrade('A');
		std3.setBranch(br3);

		Student std4 = new Student();

		std4.setId(24);
		std4.setName("rani");
		std4.setGender("female");
		std4.setPercentage(61);
		std4.setGrade('B');
		std4.setBranch(br3);

		studentOperations1.addStudent(std1);
		studentOperations1.addStudent(std2);
		studentOperations1.addStudent(std3);
		studentOperations1.addStudent(std4);

		studentOperations1.printAllStudents();

		System.out.println(studentOperations1.removeStudent(std4.getId()));

		studentOperations1.replaceStudent(std2.getId(), std3);

		System.out.println("Update Student Details : " + studentOperations1.updateStudentBranch(std3.getId(), br1));

		System.out.println(studentOperations1.getStudentByGender("female"));

		studentOperations1.printAllStudents();

	}
}