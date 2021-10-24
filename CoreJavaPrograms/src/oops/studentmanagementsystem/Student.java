package oops.studentmanagementsystem;

/**
 * This Class Contains Student Details
 * 
 * @author prasa
 *
 */

public class Student {

	private int id;
	private String name;
	private String gender;
	private double percentage;
	private char grade;

	private Branch branch;

	public Student() {

	}

	public Student(int id, String name, String gender, double percentage, char grade) {

		this.id = id;
		this.name = name;
		this.gender = gender;
		this.percentage = percentage;
		this.grade = grade;
		this.branch = branch;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Student id = " + id + "\n" + "Student Name = " + name + "\n" + "Gender = " + gender + "\n"
				+ "Percentage = " + percentage + "\n" + "Grade = " + grade + "\n" + "Branch Details : " + branch + "\n";
	}

}
