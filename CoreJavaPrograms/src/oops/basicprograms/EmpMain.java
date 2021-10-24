package oops.basicprograms;

import java.util.ArrayList;

/**
 * This Class Contains Employee and Designation Details
 * 
 * @author prasa
 *
 */

public class EmpMain {
	public static void main(String[] args) {

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

		ArrayList<EmployeeDesignation> empdeg = new ArrayList();
		empdeg.add(deg1);
		empdeg.add(deg2);
		empdeg.add(deg3);
		empdeg.add(deg4);

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

		ArrayList<Employee> emplist = new ArrayList();

		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		emplist.add(emp4);

		int count = 0;

		for (Employee em : emplist) {
			if (em.getDesignation().getExp() > 4) {
				count++;
			}
		}
		System.out.println("High Emperience Employee More Then 4 Years : " + count);

		Employee empn = null;
		double max = 0;

		for (Employee emn : emplist) {
			if (emn.getSal() > max) {
				max = emn.getSal();
				empn = emn;
			}
		}
		System.out.println("Employe High Salary and Details = " + empn);

		int count1 = 0;
		int count2 = 0;

		for (Employee empr : emplist) {
			if (empr.getDesignation().getRating() == 'A') {
				count1++;
			} else {
				count2++;
			}
		}
		System.out
				.println(" 'A' Rating Employees Count is : " + count1 + "\n 'b' Rating Employees Count is : " + count2);

		Employee ename = null;
		double min = 0;

		for (Employee esal : emplist) {
			if (esal.getSal() < min) {
				min = esal.getSal();
				ename = esal;
			}
		}
		System.out.println("Employe Low Salary and Details = " + empn);
	}
}
