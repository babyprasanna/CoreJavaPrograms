package oops.abstractionstudentmanagementsystem;

/**
 * This Class Contains StudentOperations Methods
 */

import java.util.ArrayList;

public interface StudentOperations1 {

	boolean addStudent(Student s);

	Student getStudent(int id);

	boolean removeStudent(int id);

	void replaceStudent(int id, Student newStd);

	void printAllStudents();

	Student updateStudentBranch(int id, Branch br);

	ArrayList<Student> getStudentByGender(String gender);

}
