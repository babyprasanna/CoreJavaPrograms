package oops.abstractionemployeemanagementsystem;

/**
 * This Class Declare The Methods EmployeeOperations1
 * 
 * @author prasa
 *
 */

public interface EmployeeOperations1 {

	boolean addEmployee(Employee emp);

	Employee getEmployee(int id);

	boolean removeEmployee(int id);

	void replaceEmployee(int id, Employee newEmp);

	Employee updateEmployeeEmployeeDesignation(int id, EmployeeDesignation emp);

	void printAllEmployees();

}
