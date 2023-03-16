package ComparatorExample;

public class EmployeeComparator {

	int employeeId, employeeSalary;
	String employeeName, employeeDept;
	char rating;

	public EmployeeComparator(int employeeId, int employeeSalary, String employeeName, String employeeDept,
			char rating) {
		super();
		this.employeeId = employeeId;
		this.employeeSalary = employeeSalary;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "EmployeeComparableExample [employeeId=" + employeeId + ", employeeSalary=" + employeeSalary
				+ ", employeeName=" + employeeName + ", employeeDept=" + employeeDept + ", rating=" + rating + "]";
	}

}
