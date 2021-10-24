package oops.employeemanagementsystem;

/**
 * This Class Contains EmployeeDesignation Details
 * 
 * @author prasa
 *
 */

public class EmployeeDesignation {

	private int id;
	private int exp;
	private char rating;

	public EmployeeDesignation() {
	}

	public EmployeeDesignation(int id, int exp, char rating) {

		this.id = id;
		this.exp = exp;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public char getRating() {
		return rating;
	}

	public void setRating(char rating) {
		this.rating = rating;
	}

	public String toString() {
		return "Emp Id = " + id + "\n" + "Emperience Employee = " + exp + "\n" + "Rating To Employee = " + rating
				+ "\n";
	}
}
