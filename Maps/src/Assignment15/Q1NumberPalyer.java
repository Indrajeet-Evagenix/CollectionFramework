package Assignment15;

public class Q1NumberPalyer {

	int playerId;
	String playerName, countryName, teamName;

	public Q1NumberPalyer(int playerId, String playerName, String countryName, String teamName) {

		this.playerId = playerId;
		this.playerName = playerName;
		this.countryName = countryName;
		this.teamName = teamName;
	}

	@Override
	public String toString() {
		return "Q1NumberPalyer [playerId=" + playerId + ", playerName=" + playerName + ", countryName=" + countryName
				+ ", teamName=" + teamName + "]";
	}
}
