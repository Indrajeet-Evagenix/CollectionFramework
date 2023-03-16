import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListExample {

	public static void main(String[] args) {
		CopyOnWriteArrayList<Integer> cal = new CopyOnWriteArrayList<>();

		cal.add(10);
		cal.add(20);
		cal.add(30);
		cal.add(40);
		cal.add(50);
		cal.add(10);
		cal.add(20);
		cal.add(30);
		cal.add(40);
		cal.add(50);
		cal.add(10);
		cal.add(20);
		cal.add(30);
		cal.add(40);
		cal.add(50);

		System.out.println(cal);

		Iterator<Integer> itr = cal.iterator();// Fail Safe Iterator
		while (itr.hasNext()) {
			if (itr.next() == 10) {
				cal.add(1000);
			}
		}
		System.out.println(cal);

	}

}
