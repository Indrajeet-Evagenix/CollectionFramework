package ComparatorExample;

public class Actor {

	int actorId;
	String actorName;

	@Override
	public String toString() {
		return "Actor [ActorId=" + actorId + ", ActorName=" + actorName + "]";
	}

	public Actor(int actorId, String actorName) {
		super();
		this.actorId = actorId;
		this.actorName = actorName;
	}

}
