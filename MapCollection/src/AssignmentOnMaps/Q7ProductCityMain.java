package AssignmentOnMaps;

import java.util.HashMap;
import java.util.Map;

public class Q7ProductCityMain {

	public static void main(String[] args) {
		HashMap<Q7City, HashMap<Integer, Q7Product>> city = new HashMap<>();

		HashMap<Integer, Q7Product> hm1 = new HashMap<>();
		HashMap<Integer, Q7Product> hm2 = new HashMap<>();
		HashMap<Integer, Q7Product> hm3 = new HashMap<>();

		hm1.put(1, new Q7Product(30000, "Sofa", "Wooden"));
		hm1.put(12, new Q7Product(5000, "Table", "Wooden"));
		hm1.put(8, new Q7Product(10000, "Cupboard", "Wooden"));

		hm2.put(1, new Q7Product(1000, "Chair", "Plstic"));
		hm2.put(2, new Q7Product(5000, "Wood", "Wooden"));
		hm2.put(3, new Q7Product(30000, "Bed King Size", "Wooden"));

		hm3.put(5, new Q7Product(15000, "Bed", "Iron"));
		hm3.put(4, new Q7Product(2000, "Table", "Plstic"));
		hm3.put(6, new Q7Product(50000, "Wardrobe", "Wooden"));

		city.put(new Q7City(121, "Mumbai"), hm1);
		city.put(new Q7City(151, "Pune"), hm2);
		city.put(new Q7City(131, "Nashik"), hm3);

		for (Map.Entry<Q7City, HashMap<Integer, Q7Product>> ent : city.entrySet()) {
			System.out.println(ent.getKey().cityId + " " + ent.getKey().cityName);
			for (Map.Entry<Integer, Q7Product> newEnt : ent.getValue().entrySet()) {
				System.out.println(newEnt.getKey() + " " + newEnt.getValue());
			}
			System.out.println();
		}

	}

}
