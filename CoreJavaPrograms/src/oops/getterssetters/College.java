package oops.basic4;

public class College {

	private long collegecode;
	private String collegename;
	private long studentcount;
	private long buildingscount;

	Branch branch;

	public College() {
	}

	public College(long collegecode, String collegename, long studentcount, long buildingscount) {

		this.collegecode = collegecode;
		this.collegename = collegename;
		this.studentcount = studentcount;
		this.buildingscount = buildingscount;
	}

	public long getCollegecode() {
		return collegecode;
	}

	public void setCollegecode(long collegecode) {
		this.collegecode = collegecode;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public long getStudentcount() {
		return studentcount;
	}

	public void setStudentcount(long studentcount) {
		this.studentcount = studentcount;
	}

	public long getBuildingscount() {
		return buildingscount;
	}

	public void setBuildingscount(long buildingscount) {
		this.buildingscount = buildingscount;
	}

	public String toString() {

		return "College Code = " + collegecode + "\n" + "College Name = " + collegename + "Students Count = "
				+ studentcount + "\n" + "No.Of Buildings = " + buildingscount + "\n" + "Branches is : " + branch + "\n";

	}
}
