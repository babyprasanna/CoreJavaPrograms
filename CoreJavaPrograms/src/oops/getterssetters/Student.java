package oops.basic4;

public class Student {

	private long studentid;
	private String studentname;
	private char gender;
	private float percentage;
	private int year;

	public Student() {
	}

	public Student(long studentid, String studentname, char gender, float percentage, int year) {
		this.studentid = studentid;
		this.studentname = studentname;
		this.gender = gender;
		this.percentage = percentage;
		this.year = year;
	}

	public long getStudentid() {
		return studentid;
	}

	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getPercentage() {
		return percentage;
	}

	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}

	public String toString() {
		return "Student Id = " + studentid + "\n" + "Student Name = " + studentname + "\n" + "Gender = " + gender + "\n"
				+ "Percentage = " + percentage + "\n" + "Year = " + year + "\n";
	}
}
