package oops.basic4;

public class Branch {

	private long branchcode;
	private String nameofbranch;
	private long branchstudentscount;
	private long passedoutstudentscount;

	public Branch() {
	}

	public Branch(long branchcode, String nameofbranch, long branchstudentscount, long passedoutstudentscount) {

		this.branchcode = branchcode;
		this.nameofbranch = nameofbranch;
		this.branchstudentscount = branchstudentscount;
		this.passedoutstudentscount = passedoutstudentscount;

	}

	public long getBranchcode() {
		return branchcode;
	}

	public void setBranchcode(long branchcode) {
		this.branchcode = branchcode;
	}

	public String getNameofbranch() {
		return nameofbranch;
	}

	public void setNameofbranch(String nameofbranch) {
		this.nameofbranch = nameofbranch;
	}

	public long getBranchstudentscount() {
		return branchstudentscount;
	}

	public void setBranchstudentscount(long branchstudentscount) {
		this.branchstudentscount = branchstudentscount;
	}

	public long getPassedoutstudentscount() {
		return passedoutstudentscount;
	}

	public void setPassedoutstudentscount(long passedoutstudentscount) {
		this.passedoutstudentscount = passedoutstudentscount;
	}

	public String toString() {

		return "Branch Code = " + branchcode + "\n" + "Name Of Branch = " + nameofbranch + "\n"
				+ "Students Count in Branch = " + branchstudentscount + "\n" + "PassedOut Students = "
				+ passedoutstudentscount + "\n";
	}
}
