package AssignmentsOnCollection;

import java.util.ArrayList;
import java.util.Iterator;

// 18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
public class Q18EvenNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(11);
		al.add(12);
		al.add(13);
		al.add(14);
		al.add(15);
		al.add(16);
		al.add(17);
		al.add(18);
		al.add(19);
		al.add(20);

		System.out.println(al);

		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			Integer it = itr.next();
			if (it % 2 == 0) {
				System.out.print(it + " ");
			}
		}

	}

}
