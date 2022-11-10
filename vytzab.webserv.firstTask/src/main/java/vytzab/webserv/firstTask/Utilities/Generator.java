package vytzab.webserv.firstTask.Utilities;

import java.util.ArrayList;
import java.util.List;

import vytzab.webserv.firstTask.nba.Nba;
import vytzab.webserv.firstTask.nba.Player;
import vytzab.webserv.firstTask.nba.Record;

public class Generator {

	public static Nba createNba() {
		Nba nba = new Nba();
		nba.setPlayers(createPlayerList());
		return nba;
	}

	public static List<Player> createPlayerList() {
		List<Player> playerList = new ArrayList();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player();
		Player player5 = new Player();

		Record record1 = new Record();
		Record record2 = new Record();
		Record record3 = new Record();
		Record record4 = new Record();
		Record record5 = new Record();

		record1.setGamesPlayed(1072);
		record1.setWins(706);
		record1.setLosses(366);

		record2.setGamesPlayed(897);
		record2.setWins(660);
		record2.setLosses(237);

		record3.setGamesPlayed(906);
		record3.setWins(670);
		record3.setLosses(236);

		record4.setGamesPlayed(470);
		record4.setWins(294);
		record4.setLosses(176);

		record5.setGamesPlayed(1346);
		record5.setWins(836);
		record5.setLosses(510);

		player1.setFirstName("Michael");
		player1.setLastName("Jordan");
		player1.setNationality("American");
		player1.setAge(59);
		player1.setHeight("198cm");
		player1.setWeight("98kg");
		player1.setStatus("Retired");

		player2.setFirstName("Larry");
		player2.setLastName("Bird");
		player2.setNationality("American");
		player2.setAge(65);
		player2.setHeight("206cm");
		player2.setWeight("100kg");
		player2.setStatus("Retired");

		player3.setFirstName("Earvin");
		player3.setLastName("Johnson");
		player3.setNationality("American");
		player3.setAge(63);
		player3.setHeight("206cm");
		player3.setWeight("100kg");
		player3.setStatus("Retired");

		player4.setFirstName("Arvydas");
		player4.setLastName("Sabonis");
		player4.setNationality("Lithuanian");
		player4.setAge(57);
		player4.setHeight("221cm");
		player4.setWeight("132kg");
		player4.setStatus("Retired");

		player5.setFirstName("Kobe");
		player5.setLastName("Bryant");
		player5.setNationality("American");
		player5.setAge(41);
		player5.setHeight("198cm");
		player5.setWeight("96kg");
		player5.setStatus("Retired");

		player1.getRecords().add(record1);
		player2.getRecords().add(record2);
		player3.getRecords().add(record3);
		player4.getRecords().add(record4);
		player5.getRecords().add(record5);

		playerList.add(player1);
		playerList.add(player2);
		playerList.add(player3);
		playerList.add(player4);
		playerList.add(player5);

		return playerList;

	}

}
