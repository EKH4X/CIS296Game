package game;

import java.util.ArrayList;

public interface CellInterface {
	boolean addPlayer(PlayerInterface player);
	boolean removePlayer(PlayerInterface player);
	ArrayList<PlayerInterface> getPlayers();
	boolean searchLocation(PlayerInterface player);
	void setItem(Item item);
}
