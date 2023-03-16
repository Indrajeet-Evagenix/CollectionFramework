package MapsByUsingConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class EmployeeMain {

	public void setEmployeeSetails(ArrayList<Employee> emp) {

		emp.add(new Employee(45, "Indrajeet", "Developer", "65000"));
		emp.add(new Employee(35, "Akash", "HR", "45000"));
		emp.add(new Employee(25, "Sushil", "Sales", "55000"));
		emp.add(new Employee(5, "Sikandar", "Marketing", "55000"));
		emp.add(new Employee(12, "Surj", "Developer", "52000"));
		emp.add(new Employee(18, "Arjun", "Sales", "43000"));
		emp.add(new Employee(99, "Mukesh", "Developer", "52000"));
		emp.add(new Employee(63, "Pankaj", "Marketing", "65000"));
		emp.add(new Employee(58, "Mangesh", "HR", "45000"));
		emp.add(new Employee(69, "Bhavesh", "Sales", "45000"));
		emp.add(new Employee(9, "Komal", "Marketing", "45000"));
		emp.add(new Employee(27, "Kartik", "Developer", "42000"));
		emp.add(new Employee(38, "Lucky", "HR", "65000"));
		emp.add(new Employee(34, "Chinmay", "Sales", "42000"));
		emp.add(new Employee(88, "Javed", "Developer", "66000"));
	}

	public void createMap(ArrayList<Employee> emp, HashMap<String, Integer> hmap) {

		for (Employee emp1 : emp) {
			String dept = emp1.employeeDept;
			if (hmap.containsKey(dept)) {
				int i = hmap.get(dept);
				hmap.put(dept, i + 1);
			} else {
				hmap.put(dept, 1);
			}
		}
	}

	public void employeeCountBySalary(ArrayList<Employee> emp, HashMap<String, Integer> hmap) {

		for (Employee emp1 : emp) {
			String salary = emp1.employeeSalary;
			if (hmap.containsKey(salary)) {
				int sal = hmap.get(salary);
				hmap.put(salary, sal + 1);
			} else {
				hmap.put(salary, 1);
			}
		}
	}

	public void changeName(ArrayList<Employee> emp) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Id And Name of Employee");
		int id = sc.nextInt();
		String name = sc.next();

		for (Employee emp1 : emp) {
			if (emp1.employeeId == id) {
				emp1.employeeName = name;
			}
		}
		System.out.println(emp);

	}

	public static void main(String[] args) {
		ArrayList<Employee> emp = new ArrayList<>();

		HashMap<String, Integer> hmap = new HashMap<>();

		EmployeeMain em = new EmployeeMain();
		em.setEmployeeSetails(emp);
//		em.createMap(emp, hmap);
//		System.out.println(hmap);
		em.employeeCountBySalary(emp, hmap);
		System.out.println(hmap);

		em.changeName(emp);

	}

}
