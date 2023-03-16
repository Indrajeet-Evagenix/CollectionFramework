import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<>();

		al.add("Indrajeet");
		al.add("Akash");
		al.add("Atif");
		al.add("Ankit");
		al.add("Anil");
		al.add("Sunil");

		System.out.println("-----Iterator-----");
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + "  ");
		}

		System.out.println("\n\n-----LinkedList Iterator Forward Direction-----");
		ListIterator<String> forwardIterator = al.listIterator();
		while (forwardIterator.hasNext()) {
			System.out.print(forwardIterator.next() + "  ");
		}

		System.out.println("\n\n-----LinkedList Iterator Backward Direction-----");
		ListIterator<String> backwardIterator = al.listIterator(al.size());
		while (backwardIterator.hasPrevious()) {
			System.out.print(backwardIterator.previous() + "  ");

		}

	}

}
