package AssignmentOnComparable;

//1. WAP to sort the elements of List that contains IntegerF objects.Print ArrayList.Sort using 
// Collections.sort(list) method. Print ArrayList.

import java.util.ArrayList;
import java.util.Collections;

public class Q2IntegerObjectSort {

	public void setArrayListElements(ArrayList<Integer> list) {

		list.add(50);
		list.add(98);
		list.add(45);
		list.add(36);
		list.add(85);
		list.add(75);

	}

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();

		Q2IntegerObjectSort ios = new Q2IntegerObjectSort();
		ios.setArrayListElements(list);
		System.out.println(list);
		System.out.println();

		Collections.sort(list);
		System.out.println(list);

	}

}
