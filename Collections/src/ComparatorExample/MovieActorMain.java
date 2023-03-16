package ComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MovieActorMain {

	public void setMovieDetails(ArrayList<Movie> mov) {
		ArrayList<Actor> act1 = new ArrayList<>();
		ArrayList<Actor> act2 = new ArrayList<>();
		ArrayList<Actor> act3 = new ArrayList<>();
		ArrayList<Actor> act4 = new ArrayList<>();
		ArrayList<Actor> act5 = new ArrayList<>();

		act1.add(new Actor(111, "Amitabh Bachhan"));
		act1.add(new Actor(117, "Shahrukh Khan"));

		act2.add(new Actor(122, "Salman Khan"));
		act2.add(new Actor(111, "Amitabh Bachhan"));

		act3.add(new Actor(144, "Akshay Kumar"));
		act3.add(new Actor(165, "Ajay Devgan"));
		act3.add(new Actor(154, "Ranveer Singh"));

		act4.add(new Actor(131, "Sushant Singh"));
		act4.add(new Actor(131, "Sara Khan"));

		act5.add(new Actor(111, "Amitabh Bachhan"));
		act5.add(new Actor(112, "Arun"));

		mov.add(new Movie(11, 200, "Bhootnath", act1));
		mov.add(new Movie(18, 300, "Bagban", act2));
		mov.add(new Movie(14, 250, "Suryavanshi", act3));
		mov.add(new Movie(21, 200, "Kedarnath", act4));
		mov.add(new Movie(26, 200, "Suryavansham", act5));

	}

	public void removeMovie(ArrayList<Movie> mov) {
		Iterator<Movie> itr = mov.iterator();
		System.out.println(mov);
		while (itr.hasNext()) {
			Movie mm = itr.next();
			Iterator<Actor> actorItr = mm.act.iterator();
			while (actorItr.hasNext()) {
				Actor ac = actorItr.next();
				if (ac.actorName.equalsIgnoreCase("amitabh bachhan")) {
					itr.remove();
				}
			}
		}
		System.out.println(mov);
	}

	public static void main(String[] args) {
		ArrayList<Movie> mov = new ArrayList<>();

		MovieActorMain mam = new MovieActorMain();
		mam.setMovieDetails(mov);
		System.out.println(mov);
//		mam.removeMovie(mov);

		Collections.sort(mov);

		System.out.println();

		for (Movie mm : mov) {
			Collections.sort(mm.act, new ActorNameSort());
			System.out.println(mm);
		}
	}

}
