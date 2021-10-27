package oops.abstractionemployeemanagementsystem;

/**
 * This Class Declare The Methods EmployeeOperations
 * 
 * @author prasa
 *
 */

public abstract class EmployeeOperations {

	abstract boolean addEmployee(Employee emp);

	abstract Employee getEmployee(int id);

	abstract boolean removeEmployee(int id);

	abstract void replaceEmployee(int id, Employee newEmp);

	abstract Employee updateEmployeeEmployeeDesignation(int id, EmployeeDesignation emp);

	abstract void printAllEmployees();

}
