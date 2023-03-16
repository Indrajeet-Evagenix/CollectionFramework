package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class CountCharacter {

	public static void main(String[] args) {
		ArrayList<Character> ch = new ArrayList<>();

		ch.add('a');
		ch.add('b');
		ch.add('c');
		ch.add('d');
		ch.add('a');
		ch.add('a');
		ch.add('b');
		ch.add('b');
		ch.add('c');
		ch.add('e');
		ch.add('f');

		System.out.println(ch);
//		Iterator<Character> al1 = ch.iterator();
		for (int i = 0; i < ch.size(); i++) {
			int count = 1;
			for (int j = i + 1; j < ch.size(); j++) {
				if (ch.get(i) == ch.get(j)) {
					count++;
					ch.set(j, '\0');
				}
			}
			if (ch.get(i) != '\0') {
				System.out.println(ch.get(i) + " " + count);
			}
		}

	}

}
