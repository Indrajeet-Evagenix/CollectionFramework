package AssignmentsOnCollection;

//9.	WAP to remove all elements from ArrayList
import java.util.ArrayList;
import java.util.Iterator;

public class Q9RemoveAllElements {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);

		System.out.println(al);
		Iterator<Integer> itr = al.iterator();

		while (itr.hasNext()) {
			Integer it = itr.next();

			itr.remove();

		}
		System.out.println(al);

	}

}
