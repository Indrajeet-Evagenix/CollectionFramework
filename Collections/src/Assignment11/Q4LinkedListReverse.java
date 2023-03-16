package Assignment11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Q4LinkedListReverse {

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

		ListIterator<Integer> itr = al.listIterator(al.size());
		while (itr.hasPrevious()) {
			Integer it = itr.previous();
			System.out.print(it+" ");
		}

	}

}
