package oops.studentmanagementsystem;

public class College {

	private int clgcode;
	private String clgname;
	private String clglocation;

	public College() {
	}

	public College(int clgcode, String clgname, String clglocation, Branch branch) {

		this.clgcode = clgcode;
		this.clgname = clgname;
		this.clglocation = clglocation;
	}

	public int getClgcode() {
		return clgcode;
	}

	public void setClgcode(int clgcode) {
		this.clgcode = clgcode;
	}

	public String getClgname() {
		return clgname;
	}

	public void setClgname(String clgname) {
		this.clgname = clgname;
	}

	public String getClglocation() {
		return clglocation;
	}

	public void setClglocation(String clglocation) {
		this.clglocation = clglocation;
	}

	public String toString() {

		return "College Details : " + "College Code = " + clgcode + "\n" + "College Name = " + clgname + "\n"
				+ "College Location = " + clglocation + "\n" ;
	}

}
