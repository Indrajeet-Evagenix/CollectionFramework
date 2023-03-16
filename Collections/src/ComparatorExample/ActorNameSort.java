package ComparatorExample;

import java.util.Comparator;

public class ActorNameSort implements Comparator<Actor> {

	public int compare(Actor o1, Actor o2) {
		return o1.actorName.compareTo(o2.actorName);
	}

}
