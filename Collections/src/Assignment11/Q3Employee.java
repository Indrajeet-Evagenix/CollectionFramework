package Assignment11;

public class Q3Employee {

	int employeeId;
	String employeeName;

	Q3Department department;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Q3Department getDepartment() {
		return department;
	}

	public void setDepartment(Q3Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Q3Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", department=" + department
				+ "]";
	}

	public Q3Employee(int employeeId, String employeeName, Q3Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.department = department;
	}

}
