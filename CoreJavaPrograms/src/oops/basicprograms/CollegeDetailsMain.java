package oops.basicprograms;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This Class Contains College and Teacher Details
 * 
 * @author prasa
 *
 */

public class CollegeDetailsMain {
	public static void main(String[] args) {

		Teacher teacher1 = new Teacher();

		teacher1.setTeacherid(22541);
		teacher1.setTeachersubject("java");
		teacher1.setSubsubject("cpp");
		teacher1.setNoofclasses(3);

		Teacher teacher2 = new Teacher();

		teacher2.setTeacherid(50041);
		teacher2.setTeachersubject("webdesign");
		teacher2.setSubsubject("java");
		teacher2.setNoofclasses(2);

		Teacher teacher3 = new Teacher();

		teacher3.setTeacherid(66102);
		teacher3.setTeachersubject("c");
		teacher3.setSubsubject("cpp");
		teacher3.setNoofclasses(2);

		Teacher teacher4 = new Teacher();

		teacher4.setTeacherid(44103);
		teacher4.setTeachersubject("c");
		teacher4.setSubsubject("java");
		teacher4.setNoofclasses(4);

		ArrayList<Teacher> teacherlist = new ArrayList();
		
		teacherlist.add(teacher1);
		teacherlist.add(teacher2);
		teacherlist.add(teacher3);
		teacherlist.add(teacher4);

		College sasi = new College();

		sasi.setCollegename("SASI");
		sasi.setCollegecode(5541);
		sasi.setStundentscount(1554);
		sasi.setStaffcount(250);
		sasi.setTeacher(teacher1);

		College vishnu = new College();

		vishnu.setCollegename("Vishnu");
		vishnu.setCollegecode(4412);
		vishnu.setStundentscount(45512);
		vishnu.setStaffcount(1620);
		vishnu.setTeacher(teacher2);

		College seetha = new College();

		seetha.setCollegename("Seetha");
		seetha.setCollegecode(93);
		seetha.setStundentscount(5201);
		seetha.setStaffcount(195);
		vishnu.setTeacher(teacher3);
		vishnu.setTeacher(teacher4);

		ArrayList<College> clgname = new ArrayList();

		clgname.add(sasi);
		clgname.add(vishnu);
		clgname.add(seetha);	

		int countsubsbj = 0;

		for (Teacher subsbj : teacherlist) {
			if (subsbj.getSubsubject().equals("java")) {
				countsubsbj++;
			}
		}
		System.out.println("Sub Subject Java count : " + countsubsbj);

		College stfnum = null;
		long max = 0;
		for (College clgstaff : clgname) {
			if (clgstaff.getStaffcount() > max) {
				max = clgstaff.getStaffcount();
				stfnum = clgstaff;
			}
		}
		System.out.println("High Staff in college is : " + stfnum);

		int countsubsj = 0;
		for (Teacher info : teacherlist) {
			if (info.getTeachersubject().equals("java")) {
				countsubsj++;
			}
		}
		System.out.println("Java Teaching Staff Count is : " + countsubsj);
	}
}
