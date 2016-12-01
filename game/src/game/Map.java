package game;

public class Map {
	ClientCell[][] cells;
	int size;
	public Map(int size)
	{
		this.size=size;
		cells = new ClientCell[size][size];
	}
	public int getSize()
	{
		return this.size;
	}
	public ClientCell getClientCell(int row, int column){
		return cells[row][column];
	}
	public void setCell(int row, int column, ClientCell cell)
	{
		cells[row][column]=cell;
	}
	
}
