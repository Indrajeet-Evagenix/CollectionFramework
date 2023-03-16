package ComparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;

public class CarMain {

	public void setCarDetails(ArrayList<Car> cr) {
		cr.add(new Car(111, 1200000, "Baleno", "Maruti", "1990"));
		cr.add(new Car(215, 9500000, "X5", "BMW", "1916"));
		cr.add(new Car(154, 460000, "Camry", "Toyota", "1937"));
		cr.add(new Car(111, 800000, "Brezza", "Maruti", "1990"));
		cr.add(new Car(102, 5100000, "A4", "Audi", "1909"));
		cr.add(new Car(154, 940000, "Vellfire", "Toyota", "1937"));
		cr.add(new Car(215, 4500000, "X1", "BMW", "1916"));
		cr.add(new Car(355, 1600000, "Nexun", "TATA", "1950"));
		cr.add(new Car(111, 400000, "Alto", "Maruti", "1990"));
		cr.add(new Car(102, 99000000, "Q8", "Audi", "1909"));
		cr.add(new Car(142, 5600000, "Luxary", "Jaguar", "1965"));
		cr.add(new Car(215, 6800000, "X3", "BMW", "1916"));
		cr.add(new Car(154, 450000, "Fortuner", "Toyota", "1937"));
		cr.add(new Car(132, 2500000, "Economy", "Suzuki", "1910"));
		cr.add(new Car(102, 5100000, "Q3", "Audi", "1909"));
	}

	public void sortCarDetails(ArrayList<Car> cr) {

		Collections.sort(cr);
	}

	public static void main(String[] args) {
		ArrayList<Car> cr = new ArrayList<>();

		CarMain cm = new CarMain();
		cm.setCarDetails(cr);
		System.out.println(cr);

		cm.sortCarDetails(cr);
		System.out.println(cr);

	}

}
