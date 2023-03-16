package Assignment13Comparable;

// Q.1. 1.	Create and add 4 more Employee objects in ArrayList. Print ArrayList.
// Sort ArrayList using Collections.sort(list) based on name. If name are same then sort on id. 
// Print arrayList. Add Profile(state,country) object in Employee object. 
// Do sorting of employees on the country basis.

public class Employee implements Comparable<Employee> {

	int employeeId, employeeSalary;
	String employeeName, employeeDept;

	Profile prof;

	Employee(int id, String name, int sal, String dept, Profile prof) {
		employeeId = id;
		employeeName = name;
		employeeSalary = sal;
		employeeDept = dept;
		this.prof = prof;
	}

	public String toString() {
		return "Employee [Id: " + employeeId + ", Name: " + employeeName + ", Salary: " + employeeSalary
				+ ", Department: " + employeeDept + ", Profile: " + prof + "]";
	}

	@Override
	public int compareTo(Employee o) {

		if (this.employeeName.compareTo(o.employeeName) == 0) {
			if (this.employeeId > o.employeeId) {
				return 1;
			} else if (this.employeeId < o.employeeId) {
				return -1;
			} else {
				return 0;
			}
		} else {
			return this.employeeName.compareTo(o.employeeName);
		}
	}

}
