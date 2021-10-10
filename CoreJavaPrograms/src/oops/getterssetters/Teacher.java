package oops.getterssetters;

/**
 * This Class Contains Teacher Details And Student class
 * 
 * @author prasa
 *
 */

public class Teacher {

	private long teacherid;
	private String teachersubject;
	private long noofclasses;

	private Student student;

	public Teacher() {
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teacher(long teacherid, String teachersubject, long noofclasses) {

		this.teacherid = teacherid;
		this.teachersubject = teachersubject;
		this.noofclasses = noofclasses;
	}

	public long getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(long teacherid) {
		this.teacherid = teacherid;
	}

	public String getTeachersubject() {
		return teachersubject;
	}

	public void setTeachersubject(String teachersubject) {
		this.teachersubject = teachersubject;
	}

	public long getNoofclasses() {
		return noofclasses;
	}

	public void setNoofclasses(long noofclasses) {
		this.noofclasses = noofclasses;
	}

	public String toString() {
		return "Teacher Id = " + teacherid + "\n" + "Subject Name = " + teachersubject + "\n" + "No Of Classes a Day = "
				+ noofclasses + "\n" + "Students Details : " + student + "\n";
	}
}
