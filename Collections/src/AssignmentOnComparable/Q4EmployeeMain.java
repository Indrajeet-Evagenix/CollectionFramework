package AssignmentOnComparable;

import java.util.ArrayList;
import java.util.Collections;

public class Q4EmployeeMain {

	public void setEmployeeDetails(ArrayList<Q4Employee> empal) {

		empal.add(new Q4Employee(101, "Inddrajeet", "Developer", 24));
		empal.add(new Q4Employee(121, "Akaksh", "HR", 30));
		empal.add(new Q4Employee(118, "Alok", "Marketing", 29));
		empal.add(new Q4Employee(112, "Mukesh", "Developer", 26));
	}

	public static void main(String[] args) {
		ArrayList<Q4Employee> empal = new ArrayList<>();

		Q4EmployeeMain em = new Q4EmployeeMain();
		em.setEmployeeDetails(empal);
		System.out.println(empal);

		System.out.println("\n-----Sort With Id-----");
		Collections.sort(empal);
		System.out.println(empal);

		// 6. Now do descending sort of Employee.id in Employee arraylist using < , > &
		// == technique.
		System.out.println("\n-----Sort With Id Descending Order-----");
		Collections.sort(empal, Collections.reverseOrder());
		System.out.println(empal);

	}

}
