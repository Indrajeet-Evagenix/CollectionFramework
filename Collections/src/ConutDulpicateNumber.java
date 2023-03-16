import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class ConutDulpicateNumber {

	public static void main(String[] args) {
		LinkedList<Integer> al = new LinkedList<>();

		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(4);
		al.add(70);
		al.add(5);
		al.add(9);
		al.add(4);
		al.add(10);
		al.add(5);

		System.out.println(al);

		// Count Duplicate Number
		int cnt = 0;
		Iterator<Integer> itr = al.iterator();
		while (itr.hasNext()) {
			if (itr.next() == 4) {
				cnt++;
			}
		}
		System.out.println(cnt);

	}

}
