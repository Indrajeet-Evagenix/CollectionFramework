package Practice;

import java.util.ArrayList;

public class Theatre1 {

	int theatreId;
	String theatreName;

	ArrayList<Movie1> movie;

	public Theatre1(int theatreId, String theatreName, ArrayList<Movie1> movie) {
		
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Theatre1 [TheatreId=" + theatreId + ", TheatreName=" + theatreName + ", Movie=" + movie + "]";
	}

}
