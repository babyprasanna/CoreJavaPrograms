package oops.studentmanagementsystem;

/**
 * This Class Contains Branch Details
 * 
 * @author prasa
 *
 */

public class Branch {

	private int id;
	private String branchname;

	public Branch() {

	}

	public Branch(int id, String branchname, Student student) {

		this.id = id;
		this.id = id;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	public String toString() {
		return "Branch Code = " + id + "\n" + "Branch Name = " + branchname + "\n";

	}

}
