package vytzab.webserv.firstTask.nba;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Nba {

	@XmlElementWrapper(name = "players")
	@XmlElement(name = "player")
	private List<Player> players = new ArrayList<>();
	
	public Nba() {
		
	}

	public List<Player> getPlayers() {
		return players;
	}

	public void setPlayers(List<Player> players) {
		this.players = players;
	}

	public void addPlayer(Player player) {
		players.add(player);
	}

	@Override
	public String toString() {
		String organizationString = "";
		organizationString += "Players: \n";
		for (Player player : players) {
			organizationString += player.toString() + "\n";
		}
		return organizationString;
	}

}