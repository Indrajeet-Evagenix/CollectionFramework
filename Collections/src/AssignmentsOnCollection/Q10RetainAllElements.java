package AssignmentsOnCollection;

// 10.	WAP to retain all elements from ArrayList
import java.util.ArrayList;

public class Q10RetainAllElements {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		ArrayList<Integer> al1 = new ArrayList<>();
		al1.add(6);
		al1.add(1);
		al1.add(2);
		al1.add(3);
		al1.add(4);
		al1.add(5);
		al1.add(6);

		System.out.println(al);
		System.out.println(al1);

		al1.retainAll(al);

		System.out.println(al);
		System.out.println(al1);

	}

}
