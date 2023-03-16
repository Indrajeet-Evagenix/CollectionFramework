package Revision;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MovieMain {
	ArrayList<Movie> am = new ArrayList<>();

	public void create() {

		Movie m1 = new Movie(105, "Avataar", 9.7f);
		Movie m2 = new Movie(102, "RRR", 9.1f);
		Movie m3 = new Movie(103, "KGF", 8.7f);
		Movie m4 = new Movie(104, "Bahubali", 7.2f);

		am.add(m1);
		am.add(m2);
		am.add(m3);
		am.add(m4);
	}

	ArrayList<Movie> display() {
		return am;
	}

	public static void main(String[] args) {

		MovieMain mov = new MovieMain();
//		mov.create();
//		System.out.println(mov.display());

//		System.out.println(am);
//		Collections.sort(am);
//		System.out.println(am);
//		Iterator<Movie> itr = am.iterator();
//
//		while (itr.hasNext()) {
//			Movie mm = itr.next();
//			if (mm.rating > 9) {
//				System.out.println(mm);
//			}
//		}

	}

}
