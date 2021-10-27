package oops.abstractionemployeemanagementsystem;

/**
 * This Class Contains Employee and Employee Designation Details
 * 
 * @author prasa
 *
 */

public class InterfaceMain {
	public static void main(String[] args) {
		EmployeeOperations1 employeeOperations1 = new EmployeeBuilder1();
		DesignationOperations1 designationOperations1 = new EmpDesignationBuilder1();

		EmployeeDesignation deg1 = new EmployeeDesignation();

		deg1.setId(1);
		deg1.setExp(6);
		deg1.setRating('A');

		EmployeeDesignation deg2 = new EmployeeDesignation();

		deg2.setId(2);
		deg2.setExp(4);
		deg2.setRating('B');

		EmployeeDesignation deg3 = new EmployeeDesignation();

		deg3.setId(3);
		deg3.setExp(2);
		deg3.setRating('B');

		EmployeeDesignation deg4 = new EmployeeDesignation();

		deg4.setId(4);
		deg4.setExp(8);
		deg4.setRating('A');

		designationOperations1.addEmployeeDesignation(deg1);
		designationOperations1.addEmployeeDesignation(deg2);
		designationOperations1.addEmployeeDesignation(deg3);
		designationOperations1.addEmployeeDesignation(deg4);

		Employee emp1 = new Employee();

		emp1.setId(1);
		emp1.setName("prasanna");
		emp1.setSal(2101453);
		emp1.setDesignation(deg1);

		Employee emp2 = new Employee();

		emp2.setId(2);
		emp2.setName("rajendra");
		emp2.setSal(12413);
		emp2.setDesignation(deg2);

		Employee emp3 = new Employee();

		emp3.setId(3);
		emp3.setName("rekha");
		emp3.setSal(120649);
		emp3.setDesignation(deg3);

		Employee emp4 = new Employee();

		emp4.setId(4);
		emp4.setName("rani");
		emp4.setSal(88413);
		emp4.setDesignation(deg4);

		employeeOperations1.addEmployee(emp1);
		employeeOperations1.addEmployee(emp2);
		employeeOperations1.addEmployee(emp3);
		employeeOperations1.addEmployee(emp4);

		// employeeBuilder.printAllEmployees();

		System.out.println(employeeOperations1.removeEmployee(emp2.getId()));

		employeeOperations1.replaceEmployee(emp3.getId(), emp4);

		employeeOperations1.updateEmployeeEmployeeDesignation(emp4.getId(), deg3);

		employeeOperations1.printAllEmployees();

	}
}
