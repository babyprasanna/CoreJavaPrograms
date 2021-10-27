package oops.abstractionstudentmanagementsystem;

/**
 * This Class Contains StudentOperations methods
 */

import java.util.ArrayList;

public abstract class StudentOperations {

	abstract boolean addStudent(Student s);

	abstract Student getStudent(int id);

	abstract boolean removeStudent(int id);

	abstract void replaceStudent(int id, Student newStd);

	abstract void printAllStudents();

	abstract Student updateStudentBranch(int id, Branch br);

	abstract ArrayList<Student> getStudentByGender(String gender);

}
