package ComparableAndComparator;

public class EmployeeComparableExample implements Comparable<EmployeeComparableExample> {

	int employeeId, employeeSalary;
	String employeeName, employeeDept;
	char rating;

	public EmployeeComparableExample(int employeeId, int employeeSalary, String employeeName, String employeeDept,
			char rating) {
		super();
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.rating = rating;
	}

	public String toString() {
		return "EmployeeComparableExample [employeeId=" + employeeId + ", employeeSalary=" + employeeSalary
				+ ", employeeName=" + employeeName + ", employeeDept=" + employeeDept + ", rating=" + rating + "]";
	}

	public int compareTo(EmployeeComparableExample ece) {

		// All Sorted By Ascending Order
		// Sorting By EmployeeId
//		if (this.employeeId > ece.employeeId) {
//			return 1;
//		} else if (this.employeeId < ece.employeeId) {
//			return -1;
//		} else {
//			return 0;
//		}

		// Sorting By Employee Salary
//		if (this.employeeSalary > ece.employeeSalary) {
//			return 1;
//		} else if (this.employeeSalary < ece.employeeSalary) {
//			return -1;
//		} else {
//			return 0;
//		}

		// Sorting By Employee Rating
//		if (this.rating > ece.rating) {
//			return 1;
//		} else if (this.rating < ece.rating) {
//			return -1;
//		} else {
//			return 0;
//		}

		// Sorting By Employee Name
//		return this.employeeName.compareTo(ece.employeeName);

		// All Sorted By Descending Order
		// Sorting By EmployeeId
//		if (this.employeeId > ece.employeeId) {
//			return -1;
//		} else if (this.employeeId < ece.employeeId) {
//			return 1;
//		} else {
//			return 0;
//		}

		// Sorting By Employee Rating With Name
//		if (this.rating > ece.rating) {
//			return 1;
//		} else if (this.rating < ece.rating) {
//			return -1;
//		} else {
//			return this.employeeName.compareTo(ece.employeeName);
//		}

		// Sorting By Employee Rating With ID
//		if (this.rating > ece.rating) {
//			return 1;
//		} else if (this.rating < ece.rating) {
//			return -1;
//		} else {
//			if (this.employeeId > ece.employeeId) {
//				return 1;
//			} else if (this.employeeId < ece.employeeId) {
//				return -1;
//			} else {
//				return 0;
//			}
//		}

		// Sorting By Employee Department With Salary
		if (this.employeeDept.compareTo(ece.employeeDept) == 0) {
			if (this.employeeSalary > ece.employeeSalary) {
				return 1;
			} else if (this.employeeSalary < ece.employeeSalary) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return this.employeeDept.compareTo(ece.employeeDept);
		}
	}

}
