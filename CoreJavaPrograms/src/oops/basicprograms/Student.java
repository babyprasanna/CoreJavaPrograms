package oops.basicprograms;

/**
 * This Class Contains Student Details
 * 
 * @author prasa
 *
 */

public class Student {

	private int studentid;
	private String name;
	private String gender;
	private double percentage;
	private char grade;

	private Branch branch;

	public Student() {
	}

	public Student(int studentid, String name, String gender, double percentage, char grade, Branch branch) {
		
		this.studentid = studentid;
		this.name = name;
		this.gender = gender;
		this.percentage = percentage;
		this.grade = grade;
		this.branch = branch;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		this.grade = grade;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public String toString() {
		return "Student Id = " + studentid + "\n" + "Name Of Student = " + name + "\n" + "Gender = " + gender + "\n"
				+ "Percentage of Student = " + percentage + "\n" + "Grade of Student = " + grade + "\n"
				+ "Branch Details : " + branch + "\n";
	}

}
