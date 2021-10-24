package oops.basicprograms;

/**
 * This Class Contains College Details
 * 
 * @author prasa
 *
 */

public class College {

	private String collegename;
	private long collegecode;
	private long stundentscount;
	private long staffcount;

	private Teacher teacher;

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public College() {
	}

	public College(String collegename, long collegecode, long stundentscount, long staffcount, Branch branch) {

		this.collegename = collegename;
		this.collegecode = collegecode;
		this.stundentscount = stundentscount;
		this.staffcount = staffcount;
		this.teacher = teacher;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public long getCollegecode() {
		return collegecode;
	}

	public void setCollegecode(long collegecode) {
		this.collegecode = collegecode;
	}

	public long getStundentscount() {
		return stundentscount;
	}

	public void setStundentscount(long stundentscount) {
		this.stundentscount = stundentscount;
	}

	public long getStaffcount() {
		return staffcount;
	}

	public void setStaffcount(long staffcount) {
		this.staffcount = staffcount;
	}

	public String toString() {

		return "College Name = " + collegename + "\n" + "College Code = " + collegecode + "\n" + "No.Of Students = "
				+ stundentscount + "\n" + "No.Of Staff = " + staffcount + "\n" + "Teacher Details : " + teacher + "\n";
	}

}
