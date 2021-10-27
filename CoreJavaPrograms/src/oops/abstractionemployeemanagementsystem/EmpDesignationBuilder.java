package oops.abstractionemployeemanagementsystem;

/**
 * This Class Implements EmpDesignationBuilder implements DesignationOperations Details
 */

import java.util.ArrayList;

public class EmpDesignationBuilder extends DesignationOperations {
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
