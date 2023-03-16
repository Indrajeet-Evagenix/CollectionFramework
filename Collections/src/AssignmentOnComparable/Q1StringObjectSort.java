package AssignmentOnComparable;

// 1. WAP to sort the elements of List that contains String objects.Print ArrayList.Sort using 
// Collections.sort(list) method. Print ArrayList.

import java.util.ArrayList;
import java.util.Collections;

public class Q1StringObjectSort {

	public void setArrayListElements(ArrayList<String> list) {
		list.add("Indrajeet");
		list.add("Akash");
		list.add("Mukesh");
		list.add("Pankaj");
		list.add("Anand");
		list.add("Sushil");

	}

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		Q1StringObjectSort sos = new Q1StringObjectSort();
		sos.setArrayListElements(list);
		System.out.println(list);
		System.out.println();

		Collections.sort(list);
		System.out.println(list);

	}

}
