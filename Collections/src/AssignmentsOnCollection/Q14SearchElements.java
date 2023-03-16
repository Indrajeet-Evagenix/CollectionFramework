package AssignmentsOnCollection;

// 14.	WAP to search an element from ArrayList
import java.util.ArrayList;

public class Q14SearchElements {

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

		System.out.println(al.indexOf(5));

	}

}
