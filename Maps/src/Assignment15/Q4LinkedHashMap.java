package Assignment15;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class Q4LinkedHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedHashMap<String, Integer> lmap = new LinkedHashMap<>();

		System.out.println("Enter Name And Id");
		for (int i = 0; i < 5; i++) {
			int id;
			String name;
			lmap.put(name = sc.next(), id = sc.nextInt());
		}
		System.out.println(lmap);

	}

}
