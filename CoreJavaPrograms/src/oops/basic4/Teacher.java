package oops.basic4;

public class Teacher {

	private long teacherid;
	private String teachersubject;
	private long noofclasses;

	public Teacher() {
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

	Student student;

	public String toString() {
		return "Teacher Id = " + teacherid + "\n" + "Subject Name = " + teachersubject + "\n" + "No Of Classes a Day = "
				+ noofclasses + "\n" + "Students Details : " + student + "\n";
	}
}
