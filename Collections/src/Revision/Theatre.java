package Revision;

import java.util.ArrayList;
import java.util.Iterator;

public class Theatre {

	public static void main(String[] args) {
		ArrayList<Movie> am = new ArrayList<>();

		MovieMain mov1 = new MovieMain();
//		mov1.create();
//		System.out.println(mov1.display());

		Iterator<Movie> it = am.iterator();
		while (it.hasNext()) {
			Movie m1 = it.next();
			System.out.println(m1.movieName);
		}

	}

}
