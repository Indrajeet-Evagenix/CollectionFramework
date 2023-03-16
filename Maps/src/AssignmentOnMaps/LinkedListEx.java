package AssignmentOnMaps;

import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		LinkedList<Integer> list3 = new LinkedList<>();
		for (int i = 1; i < 7; i++) {
			list1.add(i);
		}
		for (int i = 11; i < 45; i++) {
			list2.add(i);
			i = i + 10;
		}
		System.out.println(list1);
		System.out.println(list2);

		for (int i = 0; i < list1.size(); i++) {

			list3.add(list1.get(i));
			if (i < list2.size()) {
				list3.add(list2.get(i));
			}
		}
		System.out.println(list3);
	}
}