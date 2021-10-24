package oops.basicprograms;

/**
 * This Class Contains Teacher Details
 * 
 * @author prasa
 *
 */

public class Teacher {

	private long teacherid;
	private String teachersubject;
	private String subsubject;
	private long noofclasses;

	public Teacher() {
	}

	public Teacher(long teacherid, String teachersubject, String subsubject, long noofclasses, Student student) {

		this.teacherid = teacherid;
		this.teachersubject = teachersubject;
		this.subsubject = subsubject;
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

	public String getSubsubject() {
		return subsubject;
	}

	public void setSubsubject(String subsubject) {
		this.subsubject = subsubject;
	}

	public long getNoofclasses() {
		return noofclasses;
	}

	public void setNoofclasses(long noofclasses) {
		this.noofclasses = noofclasses;
	}

	public String toString() {

		return "Teacher Id = " + teacherid + "\n" + "Subject Name = " + teachersubject + "\n" + "Sub Subject Name = "
				+ subsubject + "\n" + "No Of Classes a Day = " + noofclasses + "\n";
	}
}
