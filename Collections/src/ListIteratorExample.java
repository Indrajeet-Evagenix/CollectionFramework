import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListIteratorExample {

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

		System.out.println("-----Iterator-----");
		Iterator<Integer> itr = al.iterator();// Collection, List, Queue, Set Forward Direction
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}

		System.out.println("\n-----List Iterator Forward Direction-----");
		ListIterator<Integer> flitr = al.listIterator();
		while (flitr.hasNext()) {
			System.out.print(flitr.next() + " ");
		}

		System.out.println("\n-----List Iterator Backward Direction-----");
		ListIterator<Integer> blitr = al.listIterator(al.size());
		while (blitr.hasPrevious()) {
			System.out.print(blitr.previous() + " ");
		}
	}

}
