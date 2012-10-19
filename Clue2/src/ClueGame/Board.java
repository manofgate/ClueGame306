package ClueGame;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Board {
	private ArrayList<BoardCell> cells = new ArrayList<BoardCell>();
	private Map<Character, String> rooms = new HashMap<Character, String>();
	private int numRows;
	private int numColumns;
	public void loadConfigFiles(){
		loadLegend();
		loadBoard();
	}
	public void loadLegend(){
		try{
			
			FileReader read = new FileReader("legendBoard.txt");
			Scanner scan = new Scanner(read);
			String in = "";
			String name = "";
			int i = 0;
			while(scan.hasNextLine()){
				i++;
				in = scan.nextLine();
				String[] vars = in.split(", ");
				name = vars[1].substring(0);
				char n = vars[0].charAt(0);
				if(n!= 'W')
					rooms.put(n, name);
			}
			scan.close();
			//Set<Character> Key = rooms.keySet();
		}catch(Exception e){
			e.getStackTrace();
		}
	}
	public void loadBoard(){
		try{
			int row =0;
			int col = 0;
			FileReader reader = new FileReader("Board.txt");
			Scanner scan = new Scanner(reader);
			String part = "";
			while(scan.hasNextLine()){
				row++;
				part = scan.nextLine();
				String[] vars = part.split(",");
				for(String str: vars){
					if(row<=1)
						col++;
					if(str.equals("W")){
						WalkwayCell c = new WalkwayCell();
						cells.add(c);
					}
					else{
						RoomCell c = new RoomCell(str);
						cells.add(c);
					}
				}
				if(row <=1)
					setNumColumns(col);
			}
			setNumRows(row);
			
			System.out.println("col is " +col);
			//System.out.println("Number of cells " + cells.size());
			scan.close();
		}catch(Exception e){
			e.getStackTrace();
		}
		
	}
	public int calcIndex(int row, int col){
		return numColumns*row + col;
	}
	public RoomCell getRoomCellAt(int row, int col){
		RoomCell roomCell = new RoomCell();
		roomCell = (RoomCell) getCells().get(calcIndex(row, col));
		System.out.println(roomCell.getRoomInitial());
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
	//0 indexed
	public LinkedList<Integer> getAdjList(int row, int col) { return getAdjList(calcIndex(row, col)); }
	public LinkedList<Integer> getAdjList(int cell) { return null; }
	public Set<Integer> calcTargets(int location, int distance) { return null; }
}
