package lab;

public class S_StableFactory{
	
	protected Room createRoom(int x, int y) {
		return new Room(x,y);
	}
	
	protected Door createDoor(Room room1, Room room2, String type)
	{
		Door door = null;		
		if (type.equals("box")) {
			door = new BoxDoor(room1,room2);
			room1.setSide(door);
			room2.setSide(door);
		}
		if (type.equals("door")) {
			door = new Door(room1,room2);
			room1.setSide(door);
			room2.setSide(door);
		}
		return door;
	}


}
