package oops.basic3;

/**
 * This Class Contains Teacher Details and Having Student Class
 * 
 * @author prasa
 * 
 */

import java.util.ArrayList;

public class Teacher {

	long teacherid;
	String teachersubject;
	String subsubject;
	long noofclasses;

	ArrayList<Student> student;

	public String toString() {

		return "Teacher Id = " + teacherid + "\n" + "Subject Name = " + teachersubject + "\n" + "Sub Subject Name = "
				+ subsubject + "\n" + "No Of Classes a Day = " + noofclasses + "\n" + "Students Details : " + student
				+ "\n";

	}
}
