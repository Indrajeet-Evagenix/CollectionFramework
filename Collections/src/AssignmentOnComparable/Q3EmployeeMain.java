package AssignmentOnComparable;

import java.util.ArrayList;

public class Q3EmployeeMain {

	public void setEmployeeDetails(ArrayList<Q3Employee> empal) {

		empal.add(new Q3Employee("Inddrajeet", "Developer", 24));
		empal.add(new Q3Employee("Akaksh", "HR", 30));
		empal.add(new Q3Employee("Alok", "Marketing", 29));
		empal.add(new Q3Employee("Mukesh", "Developer", 26));
	}

	public static void main(String[] args) {

		ArrayList<Q3Employee> empal = new ArrayList<>();

		Q3EmployeeMain emp = new Q3EmployeeMain();

//		emp.setEmployeeDetails(empal);
//		System.out.println(empal);
	}

}
