package Assignment13Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeMain {

	public void setEmployeeDetails(ArrayList<Employee> emp) {
		emp.add(new Employee(112, "Indrajeet", 60000, "Computer", (new Profile("Maharashtra", "India"))));
		emp.add(new Employee(155, "Akash", 65000, "IT", (new Profile("UP", "US"))));
		emp.add(new Employee(121, "Sushil", 55000, "EXTC", (new Profile("MP", "South Afrika"))));
		emp.add(new Employee(138, "Akash", 50000, "Civil", (new Profile("Odisha", "Algeria"))));

	}

	public void sortByNameAndId(ArrayList<Employee> emp) {
		Collections.sort(emp);
	}

	public void sortByCountryName(ArrayList<Employee> emp) {
		Collections.sort(emp, new SortByCountryName());
	}

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();

		EmployeeMain em = new EmployeeMain();
		em.setEmployeeDetails(emp);
		System.out.println(emp);
		em.sortByNameAndId(emp);
		System.out.println(emp);
		em.sortByCountryName(emp);
		System.out.println(emp);

	}

}
