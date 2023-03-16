import java.util.ArrayList;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(4);
		al.add(5);

		System.out.println(al);
		ArrayList<Integer> newAl = new ArrayList<>();
		for (Integer it : al) {
			if (!newAl.contains(it)) {
				newAl.add(it);
				System.out.print(it+" ");
			}
		}

//		System.out.print(newAl+" ");

	}

}
