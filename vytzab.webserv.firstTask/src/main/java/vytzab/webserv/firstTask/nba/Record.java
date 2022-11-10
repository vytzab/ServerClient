package vytzab.webserv.firstTask.nba;

import java.util.StringTokenizer;

public class Record {

	private int gamesPlayed;
	private int wins;
	private int losses;

	public Record() {
	}

	public int getGamesPlayed() {
		return gamesPlayed;
	}

	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}

	@Override
	public String toString() {
		return ("\n\tRecords \n\tGames played Record: " + gamesPlayed + "\n\tAll time wins " + wins
				+ "\n\tAll time losses: " + losses);
	}

}