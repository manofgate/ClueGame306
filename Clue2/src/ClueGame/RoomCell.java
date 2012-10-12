package ClueGame;

public class RoomCell extends BoardCell {
	public enum DoorDirection {
		UP, DOWN, LEFT, RIGHT, NONE;
	}
	private DoorDirection doorDirection;
	private char roomInitial;
	
	public boolean isRoom(){return true;}
	//private void draw(){};

	public DoorDirection getDoorDirection() {
		return doorDirection;
	}

	public void setDoorDirection(DoorDirection doorDirection) {
		this.doorDirection = doorDirection;
	}

	public char getRoomInitial() {
		return roomInitial;
	}
}
