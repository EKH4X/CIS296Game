package ClientUI;

import game.ClientCell;
import game.Map;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class MapRenderer {
Group mapLines;
Scene mapScene;
int sceneSize = 800;
int size;
Map map;
	
	public MapRenderer(Map map)
	{
		this.map = map;
		GridPane pane = new GridPane();
		for(int row=0;row<map.getSize();row++)
		{
			for(int column=0;column<map.getSize();column++)
			{
				pane.add(new ClickableCell(map.getClientCell(row, column),row, column),row,column);
			}
		}
		Scene mapScene = new Scene(pane,800.0,800.0,Color.WHITE);
		Stage mapStage = new Stage();
		mapStage.setScene(mapScene);
		mapStage.show();
		
		
	}
	private class ClickableCell extends Pane
	{
		private int row;
		private int column;
		private ClientCell clientCell;
		public ClickableCell(ClientCell clientCell, int row, int column)
		{
			this.row=row;
			this.column=column;
			this.clientCell=clientCell;
			this.setPrefSize(2000, 2000);
			setStyle("-fx-border-color: black");
			this.setOnMouseClicked(e->this.clientCell.cellClicked());
		}
	}
	

}
