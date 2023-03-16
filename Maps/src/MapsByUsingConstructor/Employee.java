package MapsByUsingConstructor;

public class Employee {

	int employeeId;
	String employeeName, employeeDept, employeeSalary;

	public Employee(int employeeId, String employeeName, String employeeDept, String employeeSalary) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
		this.employeeSalary = employeeSalary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeDept="
				+ employeeDept + ", employeeSalary=" + employeeSalary + "]";
	}

}
