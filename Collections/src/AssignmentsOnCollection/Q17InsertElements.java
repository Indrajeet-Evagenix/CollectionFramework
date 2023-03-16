package AssignmentsOnCollection;

import java.util.ArrayList;
import java.util.Iterator;

// 17.	WAP to insert an element into the ArrayList at the first position
public class Q17InsertElements {

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

		System.out.println(al);
		al.add(0, 21);
		System.out.println(al);

	}

}
