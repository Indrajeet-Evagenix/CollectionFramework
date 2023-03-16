package Practice;

public class Movie1 {

	int movieId, numberOfShows;
	String movieName;

	public Movie1(int movieId, int numberOfShows, String movieName) {
		
		this.movieId = movieId;
		this.numberOfShows = numberOfShows;
		this.movieName = movieName;
	}

	@Override
	public String toString() {
		return "Movie1 [MovieId=" + movieId + ", NumberOfShows=" + numberOfShows + ", MovieName=" + movieName + "]";
	}

}
