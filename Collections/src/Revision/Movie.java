package Revision;

public class Movie implements Comparable<Movie> {

	Integer movieId;
	String movieName;
	Float rating;

	public Movie(Integer movieId, String movieName, Float rating) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Movie o) {
		// Sort by Rating
		if (this.rating > o.rating)
			return 1;
		else if (this.rating < o.rating)
			return -1;
		else
			return 0;
	}

}
