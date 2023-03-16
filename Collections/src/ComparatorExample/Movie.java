package ComparatorExample;

import java.util.ArrayList;

public class Movie implements Comparable<Movie> {

	int movieId, boxOfficeCollection;
	String movieName;

	ArrayList<Actor> act;

	public Movie(int movieId, int boxOfficeCollection, String movieName, ArrayList<Actor> act) {
		super();
		this.movieId = movieId;
		this.boxOfficeCollection = boxOfficeCollection;
		this.movieName = movieName;
		this.act = act;
	}

	@Override
	public String toString() {
		return "Movie [MovieId=" + movieId + ", BoxOfficeCollection=" + boxOfficeCollection + "cr" + ", MovieName="
				+ movieName + ", Actor Details=" + act + "]";
	}

	public int compareTo(Movie o) {
		return this.movieName.compareTo(o.movieName);
	}

}
