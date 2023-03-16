package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

import ComparatorExample.EmployeeSortById;
import ComparatorExample.EmployeeSortByRating;
import ComparatorExample.EmployeeSortUsingName;

public class EmployeeComparableMain {

	public void setElements(ArrayList<EmployeeComparableExample> emp) {
		emp.add(new EmployeeComparableExample(102, 65000, "Indrajeet", "Computer", 'B'));
		emp.add(new EmployeeComparableExample(152, 55000, "Akaksh", "Civil", 'D'));
		emp.add(new EmployeeComparableExample(1322, 75000, "Akshay", "EXTC", 'A'));
		emp.add(new EmployeeComparableExample(112, 35000, "Sonu", "IT", 'C'));
		emp.add(new EmployeeComparableExample(1020, 25000, "Monu", "Mechanical", 'A'));
		emp.add(new EmployeeComparableExample(121, 50000, "Kartik", "Civil", 'F'));
		emp.add(new EmployeeComparableExample(172, 52000, "Amarjeet", "Computer", 'E'));
		emp.add(new EmployeeComparableExample(501, 42000, "Bhavesh", "IT", 'B'));
		emp.add(new EmployeeComparableExample(421, 41000, "Sonam", "Mechanical", 'C'));
	}

	public void sortMethod(ArrayList<EmployeeComparableExample> emp) {
		Collections.sort(emp);
	}

	public static void main(String[] args) {
		ArrayList<EmployeeComparableExample> emp = new ArrayList<>();

		EmployeeComparableMain ecm = new EmployeeComparableMain();
		ecm.setElements(emp);
		System.out.println(emp);

		System.out.println("\n------Sorting Using Comparable Method-------");
		ecm.sortMethod(emp);
		System.out.println(emp);

//		System.out.println("\n------Sorting Using Comparator Method(Sort by Name)-------");
//		Collections.sort(emp, new EmployeeSortUsingName());
//		System.out.println(emp);
//
//		System.out.println("\n------Sorting Using Comparator Method(Sort by ID)-------");
//		Collections.sort(emp, new EmployeeSortById());
//		System.out.println(emp);
//		
//		System.out.println("\n------Sorting Using Comparator Method(Sort by Rating)-------");
//		Collections.sort(emp, new EmployeeSortByRating());
//		System.out.println(emp);

	}

}
