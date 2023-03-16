package ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeComparatorMain {

	public void setElements(ArrayList<EmployeeComparator> emp) {
		emp.add(new EmployeeComparator(102, 65000, "Indrajeet", "Computer", 'B'));
		emp.add(new EmployeeComparator(152, 55000, "Akaksh", "Civil", 'D'));
		emp.add(new EmployeeComparator(1322, 75000, "Akshay", "EXTC", 'A'));
		emp.add(new EmployeeComparator(112, 35000, "Sonu", "IT", 'C'));
		emp.add(new EmployeeComparator(1020, 25000, "Monu", "Mechanical", 'A'));
		emp.add(new EmployeeComparator(121, 50000, "Kartik", "Civil", 'F'));
		emp.add(new EmployeeComparator(172, 52000, "Amarjeet", "Computer", 'E'));
		emp.add(new EmployeeComparator(501, 42000, "Bhavesh", "IT", 'B'));
		emp.add(new EmployeeComparator(421, 41000, "Sonam", "Mechanical", 'C'));
	}

	public void sortMethodById(ArrayList<EmployeeComparator> emp) {
		Collections.sort(emp, new EmployeeSortById());
	}

	public void sortMethodByRating(ArrayList<EmployeeComparator> emp) {
		Collections.sort(emp, new EmployeeSortByRating());
	}

	public void sortMethodByName(ArrayList<EmployeeComparator> emp) {
		Collections.sort(emp, new EmployeeSortUsingName());
	}

	public static void main(String[] args) {
		ArrayList<EmployeeComparator> emp = new ArrayList<>();

		EmployeeComparatorMain ecm = new EmployeeComparatorMain();
		ecm.setElements(emp);
		System.out.println(emp);
		System.out.println("\n-----Sort By Employee ID-----");
		ecm.sortMethodById(emp);
		System.out.println(emp);
		System.out.println("\n-----Sort By Employee Rating-----");
		ecm.sortMethodByRating(emp);
		System.out.println(emp);
		System.out.println("\n-----Sort By Employee Name-----");
		ecm.sortMethodByName(emp);
		System.out.println(emp);

	}

}
