package ClueGame;

import java.util.ArrayList;
import java.util.Map;

public class Board {
	private ArrayList<BoardCell> cells;
	private Map<Character, String> rooms;
	private int numRows;
	private int numColumns;
	public void loadConfigFiles(){
		
	}
	public void loadLegend(){
		
	}
	public void loadBoard(){
		
	}
	public int calcIndex(int row, int col){
		return 0;
	}
	public RoomCell getRoomCellAt(int row, int col){
		RoomCell roomCell = new RoomCell();
		return roomCell;
	}
	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<BoardCell> getCells() {
		return cells;
	}
	public void setCells(ArrayList<BoardCell> cells) {
		this.cells = cells;
	}
	public Map<Character, String> getRooms() {
		return rooms;
	}
	public void setRooms(Map<Character, String> rooms) {
		this.rooms = rooms;
	}
	public int getNumRows() {
		return numRows;
	}
	public void setNumRows(int numRows) {
		this.numRows = numRows;
	}
	public int getNumColumns() {
		return numColumns;
	}
	public void setNumColumns(int numColumns) {
		this.numColumns = numColumns;
	}
	
}
