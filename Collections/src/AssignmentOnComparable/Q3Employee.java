package AssignmentOnComparable;

import java.util.ArrayList;

// 3. WAP to create a class Employee with (name, designation and age).Now create and add Employee
// objects elements to Arraylist. Print ArrayList.

public class Q3Employee {

	String employeeName, employeeDesignation;
	int employeeAge;

	public Q3Employee(String employeeName, String employeeDesignation, int employeeAge) {
		super();
		this.employeeName = employeeName;
		this.employeeDesignation = employeeDesignation;
		this.employeeAge = employeeAge;
	}

	@Override
	public String toString() {
		return "Q3Employee [employeeName=" + employeeName + ", employeeDesignation=" + employeeDesignation
				+ ", employeeAge=" + employeeAge + "]";
	}

	public static void main(String[] args) {
		ArrayList<Q3Employee> emp = new ArrayList<>();

		emp.add(new Q3Employee("Indrajeet", "Developer", 24));
		emp.add(new Q3Employee("Ankita", "Marketing", 28));
		emp.add(new Q3Employee("Mukesh", "HR", 30));
		emp.add(new Q3Employee("Pankaj", "Developer", 27));

		System.out.println(emp);
	}

}
