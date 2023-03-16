package AssignmentsOnCollection;

// 12.	WAP to test an ArrayList is empty or not
import java.util.ArrayList;

public class Q12TestArrayEmpty {

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

		System.out.println(al.isEmpty());
	}

}
