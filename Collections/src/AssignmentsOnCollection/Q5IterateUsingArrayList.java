package AssignmentsOnCollection;

//5.	WAP to iterate through all elements in an ArrayList using for loop
import java.util.ArrayList;

public class Q5IterateUsingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);

		System.out.println(al);

		for (int i = 0; i < al.size(); i++) {
			System.out.println(i);
		}

	}

}
