package Assignment11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

// while iterating we can not add or remove elements from ArrayList
public class Q2IteratorFail {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);

//		for(Integer it:al) {// Fail Fast Iterator
//			al.add(60);
//		}
//		System.out.println(al);

//		Iterator<Integer> itr = al.iterator();// Fail Fast Iterator
//		while (itr.hasNext()) {
//			if (itr.next() == 10) {
//				al.add(100);
//			}
//		}
		// while iterating we can remove all the elements or
//		Iterator<Integer> itr1 = al.iterator();
//		while (itr1.hasNext()) {
//			if (itr1.next() == 10) {
//				itr1.remove();
//			}
//		}
//		System.out.println(al);

		// while iterating we can use set method for replace one element to another
		ListIterator<Integer> itr2 = al.listIterator();
		while (itr2.hasNext()) {
			if (itr2.next() == 10) {
				itr2.set(150);
			}
		}
		System.out.println(al);

	}

}
