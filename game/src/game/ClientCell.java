package game;

import java.util.ArrayList;
import java.util.HashMap;

import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class ClientCell {
	//ArrayList<ClientPlayer> players;
	HashMap<String,ClientPlayer> players;
	ListView<String> listview;
	public ClientCell(ObservableList<String> playerList)
	{
		players = null;
		listview = new ListView<String>();
		listview.setItems(playerList);
		listview.setOnMouseClicked(e->this.selectedPlayer());
	}
	public ClientCell(HashMap<String,ClientPlayer> players)
	{
		this.players=players;
		listview=null;
	}
	public ClientCell()
	{
		
	}
	public void cellClicked()
	{
		GridPane pane = new GridPane();
		pane.add(listview, 0, 0);
		Stage actionStage = new Stage();
		Group root = new Group();
		root.getChildren().add(pane);
		Scene actionScene = new Scene(root,800.0,800.0,Color.WHITE);
		actionStage.setScene(actionScene);
		actionStage.show();	
	}
	private void selectedPlayer()
	{
		if()
	}
}
