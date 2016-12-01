package game;


import ClientUI.MapRenderer;
import javafx.application.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
public class Client extends Application{

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Start of testing stuff
		Map map = new Map(25);
		
		//Start of testdata
		ObservableList<String> playerList = FXCollections.observableArrayList("Test1","Test2");
		
		for(int x=0;x<25;x++)
		{
			for(int y=0;y<25;y++)
			{
				if(x==2 && y==2)
				{
					map.setCell(x, y, new ClientCell(playerList));
				}
				else{
					map.setCell(x, y, new ClientCell());
				}
			}
		}
		
		MapRenderer mapRenderer = new MapRenderer(map);
		//end of testing stuff
	}

}
