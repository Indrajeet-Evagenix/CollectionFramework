package AssignmentOnMaps;

import java.util.LinkedList;

// 13. Given two LinkedList, we need to combine two LinkedList in such a way that the 
// combined aList has alternate elements of both. If one list has extra element, then 
// these elements are appended at the end of the combined list.
// Input: list1 = {1, 2, 3, 4, 5, 6}
// List2 = {11, 22, 33, 44}
// List3: {1, 11, 2, 22, 3, 33, 4, 44, 5, 6}

public class Q13AppenedList {

	public void setElementList1(LinkedList<Integer> list1) {

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);

	}

	public void setElementList2(LinkedList<Integer> list2) {

		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);

	}

	public void setElementList3(LinkedList<Integer> list3, LinkedList<Integer> list1, LinkedList<Integer> list2) {

		for (int i = 0; i < list1.size(); i++) {
			list3.add(list1.get(i));
			if (i < list2.size()) {
				list3.add(list2.get(i));
			}
		}

	}

	public static void main(String[] args) {

		LinkedList<Integer> list1 = new LinkedList<>();
		LinkedList<Integer> list2 = new LinkedList<>();
		LinkedList<Integer> list3 = new LinkedList<>();

		Q13AppenedList al = new Q13AppenedList();
		al.setElementList1(list1);
		System.out.println("List 1: " + list1);

		al.setElementList2(list2);
		System.out.println("List 2: " + list2);

		al.setElementList3(list3, list1, list2);
		System.out.println("List 3: " + list3);
	}
}
