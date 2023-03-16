package Practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class CarMain {

	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<>();

		al.add(new Car(11, 1200000, "Baleno", "1990", "Maruti"));
		al.add(new Car(12, 1300000, "XUV", "1991", "Maruti"));
		al.add(new Car(13, 1350000, "Baleno", "1992", "Maruti"));
		al.add(new Car(14, 1400000, "Baleno", "1993", "Maruti"));
		al.add(new Car(15, 1450000, "Baleno", "1990", "Maruti"));
		al.add(new Car(16, 1500000, "Baleno", "1994", "Maruti"));
		al.add(new Car(17, 1200000, "Baleno", "1990", "Maruti"));
		al.add(new Car(18, 1300000, "Baleno", "1991", "Maruti"));
		al.add(new Car(19, 1400000, "Baleno", "1992", "Maruti"));

		System.out.println(al);

		ListIterator<Car> itr = al.listIterator();
		while (itr.hasNext()) {
			Car cr = itr.next();
			if (cr.launchYear.equals("1990")) {
				itr.remove();
			}
		}
		System.out.println(al);

	}

}
