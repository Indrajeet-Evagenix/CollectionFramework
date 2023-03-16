package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class Movie1Theatre1Main {

	public void setMovieDetails(ArrayList<Theatre1> theatre) {

		ArrayList<Movie1> mov1 = new ArrayList<>();
		ArrayList<Movie1> mov2 = new ArrayList<>();
		ArrayList<Movie1> mov3 = new ArrayList<>();
		ArrayList<Movie1> mov4 = new ArrayList<>();
		ArrayList<Movie1> mov5 = new ArrayList<>();

		mov1.add(new Movie1(111, 5, "KGF"));
		mov1.add(new Movie1(118, 2, "RRR"));
		mov1.add(new Movie1(124, 4, "AVATAAR"));
		mov1.add(new Movie1(129, 1, "BAHUBALI"));
		mov1.add(new Movie1(135, 3, "KGF 2"));

		mov2.add(new Movie1(111, 2, "KGF"));
		mov2.add(new Movie1(118, 3, "RRR"));
		mov2.add(new Movie1(124, 1, "AVATAAR"));
		mov2.add(new Movie1(129, 5, "BAHUBALI"));
		mov2.add(new Movie1(135, 4, "KGF 2"));

		mov3.add(new Movie1(111, 3, "KGF"));
		mov3.add(new Movie1(118, 4, "RRR"));
		mov3.add(new Movie1(124, 5, "AVATAAR"));
		mov3.add(new Movie1(129, 2, "BAHUBALI"));
		mov3.add(new Movie1(135, 1, "KGF 2"));

		mov4.add(new Movie1(111, 1, "KGF"));
		mov4.add(new Movie1(118, 2, "RRR"));
		mov4.add(new Movie1(124, 4, "AVATAAR"));
		mov4.add(new Movie1(129, 1, "BAHUBALI"));
		mov4.add(new Movie1(135, 5, "KGF 2"));

		mov5.add(new Movie1(111, 6, "KGF"));
		mov5.add(new Movie1(118, 1, "RRR"));
		mov5.add(new Movie1(124, 3, "AVATAAR"));
		mov5.add(new Movie1(129, 2, "BAHUBALI"));
		mov5.add(new Movie1(135, 5, "KGF 2"));

		theatre.add(new Theatre1(215, "PVR", mov1));
		theatre.add(new Theatre1(215, "INOX", mov2));
		theatre.add(new Theatre1(215, "MIRAJ", mov3));
		theatre.add(new Theatre1(215, "MAXUS", mov4));
		theatre.add(new Theatre1(215, "BHARAT", mov5));
	}

	public void showsDeleted(ArrayList<Theatre1> theatre) {
		System.out.println(theatre);
		for (Theatre1 th : theatre) {
			Iterator<Movie1> movieItr = th.movie.iterator();
			while (movieItr.hasNext()) {
				Movie1 mm = movieItr.next();
				if (mm.numberOfShows <= 2) {
					movieItr.remove();
				}
			}
		}
		System.out.println(theatre);
	}

	public static void main(String[] args) {
		ArrayList<Theatre1> theatre = new ArrayList<>();

		Movie1Theatre1Main mtm = new Movie1Theatre1Main();

		mtm.setMovieDetails(theatre);
		mtm.showsDeleted(theatre);

	}

}
