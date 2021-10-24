package oops.studentmanagementsystem;

import java.util.ArrayList;
import java.util.List;

/**
 * This Class Contain Branch Builder Details
 * 
 * @author prasa
 *
 */

public class BranchBuilder {

	List<Branch> branchlist = new ArrayList<>();

	public boolean addBranch(Branch b) {
		for (Branch br : branchlist) {
			if (br.getId() == b.getId()) {
				return false;
			}
		}
		branchlist.add(b);
		return true;
	}

	public Branch getBranch(int id) {
		for (Branch br : branchlist) {
			if (br.getId() == id) {
				return br;
			}
		}
		return null;
	}
}
