package oops.getterssetters;

/**
 * This Class Contains College and Branch, Teacher and Student Details
 * 
 * @author prasa
 *
 */

public class CollegeMain {

	public static void main(String[] args) {
		Student s1 = new Student();

		s1.setStudentid(22505);
		s1.setStudentname("Prasanna G");
		s1.setGender('F');
		s1.setPercentage(75.19f);
		s1.setYear(2018);

		Student s2 = new Student();

		s2.setStudentid(60511);
		s2.setStudentname("Rajendra M");
		s2.setGender('M');
		s2.setPercentage(81.02f);
		s2.setYear(2018);

		Teacher teacher = new Teacher();

		teacher.setTeacherid(50122);
		teacher.setTeachersubject("Java");
		teacher.setNoofclasses(3);
		teacher.setStudent(s1);

		System.out.println(teacher);

		Teacher teacher1 = new Teacher();

		teacher1.setTeacherid(15201);
		teacher1.setTeachersubject("C ++");
		teacher1.setNoofclasses(4);
		teacher1.setStudent(s1);

		System.out.println(teacher1);

		Branch cse = new Branch();

		cse.setBranchcode(022);
		cse.setNameofbranch("CSE");
		cse.setBranchstudentscount(2251);
		cse.setPassedoutstudentscount(2210);

		Branch ece = new Branch();

		ece.setBranchcode(511);
		ece.setNameofbranch("ECE");
		ece.setBranchstudentscount(1251);
		ece.setPassedoutstudentscount(1211);

		College sasi = new College();

		sasi.setCollegecode(1565);
		sasi.setCollegename("Sasi Institute of Technology and Engineering");
		sasi.setStudentcount(5664);
		sasi.setBuildingscount(9);
		sasi.setBranch(cse);

		System.out.println(sasi);

		College seetha = new College();

		seetha.setCollegecode(93);
		seetha.setCollegename("Smt B.Seetha Polytechnic");
		seetha.setStudentcount(9464);
		seetha.setBuildingscount(4);
		seetha.setBranch(ece);

		System.out.println(seetha);
		
	}
}
