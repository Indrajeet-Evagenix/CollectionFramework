package AssignmentsOnCollection;

import java.util.ArrayList;

// 16.	WAP to retrieve an element (at a specified index) from a given ArrayList

public class Q16RetrieveElements {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);

		System.out.println(al.indexOf(5));

	}

}
