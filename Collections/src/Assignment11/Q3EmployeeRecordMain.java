package Assignment11;

import java.util.Iterator;
import java.util.LinkedList;

public class Q3EmployeeRecordMain {

	public static void main(String[] args) {

		LinkedList<Q3Employee> emp = new LinkedList<>();

		emp.add(new Q3Employee(101, "Indrajeet", (new Q3Department(1, "Computer"))));
		emp.add(new Q3Employee(12, "Akash", (new Q3Department(2, "Civil"))));
		emp.add(new Q3Employee(13, "Mukesh", (new Q3Department(3, "IT"))));
		emp.add(new Q3Employee(10, "Sushil", (new Q3Department(4, "EXTC"))));
		emp.add(new Q3Employee(15, "Hritik", (new Q3Department(5, "Mechanical"))));
		emp.add(new Q3Employee(16, "Suraj", (new Q3Department(6, "Computer"))));
		emp.add(new Q3Employee(10, "Sonu", (new Q3Department(7, "Civil"))));

		Iterator<Q3Employee> empNew = emp.iterator();
		while (empNew.hasNext()) {
			if (empNew.next().employeeId == 10) {
				empNew.remove();
			}
		}
		System.out.println(emp);

	}

}
