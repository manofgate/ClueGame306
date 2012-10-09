package board;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeSet;


public class IntBoard {
	private static int ROWS = 4;
	private static int COLS =4;
	private static int GRID_PIECES;
	private Map<Integer, LinkedList<Integer>> adjMtx;
	
	public IntBoard() {
		super();
		// TODO Auto-generated constructor stub
		GRID_PIECES = ROWS*COLS;
		adjMtx = new HashMap<Integer, LinkedList<Integer>>();
	}
	public void calcAdjacencies(){
		//for loops
		for(int i = 0; i<GRID_PIECES; ++i){
			adjMtx.put(i, getAdjList(i));
		}
	}
	public void calcTargets(int startLoc, int steps){
		//TODO 
	}
	public TreeSet getTargets(){
		//TODO
		TreeSet targets = new TreeSet();
		return targets;
	}
	public LinkedList getAdjList(int cell){
		LinkedList adjList = new LinkedList();
		if(cell %COLS ==0){
			//left edge
			if(cell == 0){
				//top
				adjList.add(cell +1);
				adjList.add(cell+COLS);
			}
			else if(cell == GRID_PIECES - COLS){
				//bottom
				adjList.add(cell +1);
				adjList.add(cell-4);
			}
			else {
				// inbetween
				adjList.add(cell+1);
				adjList.add(cell+4);
				adjList.add(cell-4);
			}		
		}
		else if((cell+1)%COLS == GRID_PIECES%COLS){
			//right edge
			if(cell == COLS -1){
				//top
				adjList.add(cell -1);
				adjList.add(cell+COLS);
			}
			else if(cell == GRID_PIECES - 1){
				//bottom
				adjList.add(cell -1);
				adjList.add(cell-4);
			}
			else {
				// inbetween
				adjList.add(cell-1);
				adjList.add(cell+4);
				adjList.add(cell-4);
			}
		}
		else if(cell < COLS){
			//on top
			adjList.add(cell+1);
			adjList.add(cell -1);
			adjList.add(cell+4);
		}
		else if(cell >(GRID_PIECES - COLS)){
			//on bottom
			adjList.add(cell+1);
			adjList.add(cell-1);
			adjList.add(cell-4);
		}
		else{
			//inbetween
			adjList.add(cell+1);
			adjList.add(cell-1);
			adjList.add(cell+4);
			adjList.add(cell-4);
		}
		return adjList;
	}
	public int calcIndex(int row, int column){
		return row*4 + column;
	}
}
