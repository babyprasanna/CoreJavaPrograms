package oops.abstractionstudentmanagementsystem;

/**
 * This Class Contains StudentOperations Details
 */

import java.util.ArrayList;

public class StudentBuilder1 implements StudentOperations1 {

	ArrayList<Student> stulist = new ArrayList();

	public boolean addStudent(Student s) {

		for (Student std : stulist) {
			if (std.getId() == s.getId()) {
				return false;
			}
		}
		stulist.add(s);
		return true;
	}

	public Student getStudent(int id) {
		for (Student s : stulist) {
			if (s.getId() == id) {
				return s;
			}
		}
		return null;
	}

	public boolean removeStudent(int id) {

		Student temp = null;
		boolean find = false;

		for (Student s : stulist) {
			if (s.getId() == id) {
				temp = s;
				find = true;
			}
		}
		if (find) {
			stulist.remove(temp);
		}
		return find;
	}

	public void replaceStudent(int id, Student newStd) {
		removeStudent(id);
		addStudent(newStd);
	}

	public void printAllStudents() {
		System.out.println("\n The All Students Are : ");
		for (Student s : stulist) {
			System.out.println(s);
		}
	}

	public Student updateStudentBranch(int id, Branch br) {
		Student temp = null;
		for (Student std : stulist) {
			if (std.getId() == id) {
				std.setBranch(br);
				temp = std;
				break;
			}
		}
		return temp;
	}

	public ArrayList<Student> getStudentByGender(String gender) {
		ArrayList<Student> temp = new ArrayList();

		for (Student std : stulist) {
			if (std.getGender().equals(gender)) {
				temp.add(std);
			}
		}
		return temp;
	}

}
