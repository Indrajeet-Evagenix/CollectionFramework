package AssignmentsOnCollection;

// 4.	WAP to print all elements of ArrayList using iterator
import java.util.ArrayList;
import java.util.Iterator;

public class Q4PrintElementsUsingIterator {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);

		System.out.println(al);

		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
