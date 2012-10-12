package ClueGame;

public abstract class BoardCell {
	private int row;
	private int col;
	private char name;
	public boolean isWalkway(){return false;}
	public boolean isRoom(){return false;}
	public boolean isDoorway(){return false;}
	//abstract void draw(); 
}
