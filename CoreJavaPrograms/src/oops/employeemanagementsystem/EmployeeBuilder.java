package oops.employeemanagementsystem;

/**
 * This Class Contains Employee Builder Details
 * 
 * @author prasa
 * 
 */

import java.util.ArrayList;

public class EmployeeBuilder {

	ArrayList<Employee> emplist = new ArrayList();

	public boolean addEmployee(Employee emp) {
		for (Employee em : emplist) {
			if (em.getId() == emp.getId()) {
				return false;
			}
		}
		emplist.add(emp);
		return true;
	}

	public Employee getEmployee(int id) {
		for (Employee emp : emplist) {
			if (emp.getId() == id) {
				return emp;
			}
		}
		return null;
	}

	public boolean removeEmployee(int id) {
		Employee temp = null;
		boolean find = false;

		for (Employee emp : emplist) {
			if (emp.getId() == id) {
				temp = emp;
				find = true;
			}
		}
		if (find == true) {
			emplist.remove(temp);
		}
		return find;
	}

	public void replaceEmployee(int id, Employee newEmp) {
		removeEmployee(id);
		addEmployee(newEmp);
	}

	public Employee updateEmployeeEmployeeDesignation(int id, EmployeeDesignation emp) {
		Employee temp = null;
		for (Employee empr : emplist) {
			if (empr.getId() == id) {
				empr.setDesignation(emp);
				temp = empr;
				break;
			}
		}
		return temp;
	}

	public void printAllEmployees() {
		System.out.println("All Employees Details : ");
		for (Employee allemp : emplist) {
			System.out.println(allemp);
		}
	}
}