package lab;

import java.awt.event.KeyEvent;

public class S_StableFactory{
	
	protected Room createRoom(int x, int y) {
		Room room = new Room(x,y);
		room.setSide(new Wall(KeyEvent.VK_UP));
		room.setSide(new Wall(KeyEvent.VK_LEFT));			
		room.setSide(new Wall(KeyEvent.VK_DOWN));
		room.setSide(new Wall(KeyEvent.VK_RIGHT));
		Stable.instance().addRoom(room);
		return room;
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
