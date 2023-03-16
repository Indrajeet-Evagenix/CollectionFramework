import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> vec = new Vector<>();

		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);
		vec.add(10);
		vec.add(20);
		vec.add(30);
		vec.add(40);
		vec.add(50);

		System.out.println(vec);

		Enumeration<Integer> enu = vec.elements();// Fail Safe Iterator

		while (enu.hasMoreElements()) {
			if (enu.nextElement() == 10) {
				vec.add(100);
			}
		}
		System.out.println(vec);

	}

}
