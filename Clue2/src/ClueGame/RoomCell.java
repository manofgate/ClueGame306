package ClueGame;

public class RoomCell extends BoardCell {
	public enum DoorDirection {
		UP, DOWN, LEFT, RIGHT, NONE;
	}
	private DoorDirection doorDirection;
	
	public boolean isRomm(){return true;}
	//private void draw(){};
}
