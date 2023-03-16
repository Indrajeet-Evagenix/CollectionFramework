package Practice;

import java.util.ArrayList;

public class ContainsMethods {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();

		str.add("Indrajeet");
		str.add("Peer");
		str.add("Veer");
		str.add("Weak");
		str.add("Meat");
		str.add("Tree");

		System.out.println(str);

		for (String str1 : str) {
			if (str1.contains("ee")) {
				System.out.println(str1);
			}
		}
	}

}
