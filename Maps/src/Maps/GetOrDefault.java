package Maps;

import java.util.HashMap;

public class GetOrDefault {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<>();

		hm.put(1, "Java");
		hm.put(2, "Python");
		hm.put(3, "C++");
		System.out.println("HashMap: " + hm);

		String value1 = hm.getOrDefault(1, "Not Found");
		System.out.println("Value for key 1:  " + value1);

		String value2 = hm.getOrDefault(4, "Not Found");
		System.out.println("Value for key 4: " + value2);
	}

}
