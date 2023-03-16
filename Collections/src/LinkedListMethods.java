import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(70);
		al.add(5);
		al.add(9);
		al.add(4);
		al.add(10);
		al.add(5);

		System.out.println(al);
//		al.addFirst(60);
//		System.out.println(al);

//		al.addLast(80);
//		System.out.println(al);

//		Iterator<Integer> itr = al.descendingIterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next() + " ");
//		}

//		Collections.sort(al);
//		System.out.println(al);

//		Collections.reverse(al);
//		System.out.println(al);

//		System.out.println(Collections.frequency(al, 5));

		// Count Duplicate Number
//		int cnt = 0;
//		Iterator<Integer> itr = al.iterator();
//		while (itr.hasNext()) {
//			if (itr.next() == 4) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);

		// Remove Duplicates From LinkedList
//		ArrayList<Integer> al2 = new ArrayList<>();// we can use ArrayList Also
		LinkedList<Integer> al1 = new LinkedList<>();
		for (Integer i : al) {
			if (!al1.contains(i)) {
				al1.add(i);
			}
		}
		System.out.println(al1);

	}

}
