package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class AddCharacter {

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

		Iterator<Character> itr = ch.iterator();

		for (int i = 0; i < ch.size(); i++) {
			if (ch.get(i) == 'a') {
				ch.add(i + 1, 'z');
			}
		}
		System.out.println(ch);
	}

}
