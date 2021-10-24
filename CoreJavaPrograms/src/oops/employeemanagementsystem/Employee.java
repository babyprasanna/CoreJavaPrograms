package oops.employeemanagementsystem;

/**
 * This Class Contains Employee Details
 * 
 * @author prasa
 *
 */

public class Employee {

	private int id;
	private String name;
	private double sal;

	private EmployeeDesignation designation;

	public Employee() {
	}

	public Employee(int id, String name, double sal, EmployeeDesignation designation) {

		this.id = id;
		this.name = name;
		this.sal = sal;
		this.designation = designation;
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

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public EmployeeDesignation getDesignation() {
		return designation;
	}

	public void setDesignation(EmployeeDesignation designation) {
		this.designation = designation;
	}

	public String toString() {
		return "Employee Id = " + id + "\n" + "Employee Name = " + name + "\n" + "Employee Salary = " + sal + "\n"
				+ "Employee Designation Details : " + designation + "\n";
	}

}
