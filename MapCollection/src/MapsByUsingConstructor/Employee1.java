package MapsByUsingConstructor;

public class Employee1 {

	int employeeId;
	String employeeName, employeeDept, employeeSalary;

	Address add;

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

	public String getEmployeeDept() {
		return employeeDept;
	}

	public void setEmployeeDept(String employeeDept) {
		this.employeeDept = employeeDept;
	}

	public String getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(String employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Employee1(int employeeId, String employeeName, String employeeDept, String employeeSalary, Address add) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeSalary = employeeSalary;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDept="
				+ employeeDept + ", employeeSalary=" + employeeSalary + ", add=" + add + "]";
	}

}