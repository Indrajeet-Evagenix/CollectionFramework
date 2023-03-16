package MapsByUsingConstructor;

import java.util.ArrayList;
import java.util.HashMap;

public class Employee1AddressMain {

	public void setEmployeeSetails(ArrayList<Employee1> emp) {

		emp.add(new Employee1(45, "Indrajeet", "Developer", "65000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(35, "Akash", "HR", "45000", new Address("khajana", "Delhi")));
		emp.add(new Employee1(25, "Sushil", "Sales", "55000", new Address("Ujjain", "MP")));
		emp.add(new Employee1(5, "Sikandar", "Marketing", "55000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(12, "Surj", "Developer", "52000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(18, "Arjun", "Sales", "43000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(99, "Mukesh", "Developer", "52000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(63, "Pankaj", "Marketing", "65000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(58, "Mangesh", "HR", "45000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(69, "Bhavesh", "Sales", "45000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(9, "Komal", "Marketing", "45000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(27, "Kartik", "Developer", "42000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(38, "Lucky", "HR", "65000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(34, "Chinmay", "Sales", "42000", new Address("Mumbai", "Maharashtra")));
		emp.add(new Employee1(88, "Javed", "Developer", "66000", new Address("Mumbai", "Maharashtra")));
	}

	public void createMap(ArrayList<Employee1> emp, HashMap<String, Integer> hmap) {

		for (Employee1 emp1 : emp) {
			String cit = emp1.add.city;
			if (hmap.containsKey(cit)) {
				int i = hmap.get(cit);
				hmap.put(cit, i + 1);
			} else {
				hmap.put(cit, 1);
			}
		}
	}

	public static void main(String[] args) {
		ArrayList<Employee1> emp = new ArrayList<>();

		HashMap<String, Integer> hmap = new HashMap<>();
		Employee1AddressMain em = new Employee1AddressMain();
		em.setEmployeeSetails(emp);
		System.out.println(emp);
		em.createMap(emp, hmap);
		System.out.println(hmap);

	}

}
