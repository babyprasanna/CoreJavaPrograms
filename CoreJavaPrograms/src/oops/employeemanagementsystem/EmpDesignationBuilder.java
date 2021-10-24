package oops.employeemanagementsystem;

/**
 * This Class Contains Employee Designation Builder Details
 */

import java.util.ArrayList;

public class EmpDesignationBuilder {

	ArrayList<EmployeeDesignation> empdgn = new ArrayList();

	public boolean addEmployeeDesignation(EmployeeDesignation empd) {
		for (EmployeeDesignation ed : empdgn) {
			if (ed.getId() == empd.getId()) {
				return false;
			}
		}
		empdgn.add(empd);
		return true;
	}

	public EmployeeDesignation getEmployeeDesignation(int id) {
		for (EmployeeDesignation emd : empdgn) {
			if (emd.getId() == id) {
				return emd;
			}
		}
		return null;
	}
}
