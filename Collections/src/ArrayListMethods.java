import java.util.ArrayList;

public class ArrayListMethods {

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
		
		// https://github.com/Indrajeet-Evagenix/ArraysInJava.git
		// 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

		ArrayList<Integer> list = new ArrayList<>();
		list.add(2000);
		list.add(3000);
		list.add(4000);
		list.add(5000);

		al.addAll(list);
//		System.out.print(al + " ");

		al.addAll(2, list);
//		System.out.print(al + " ");

		al.remove(2);
//		System.out.print(al + " ");

//		al.removeAll(list);
//		System.out.print(al + " ");

		al.retainAll(list);
//		System.out.print(al + " ");

		al.set(2, 55);
//		System.out.print(al + " ");

		System.out.println(al.equals(list));

	}

}
