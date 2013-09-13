package lab;

import java.awt.event.KeyEvent;

public class S_StableFactory{
	
	protected Room createRoom(int x, int y, String type) {
		Room room = null;
		if (type.equals("RightOpen")) {
			room = new Room(x,y);
			room.setSide(new Wall(KeyEvent.VK_UP));
			room.setSide(new Wall(KeyEvent.VK_LEFT));			
			room.setSide(new Wall(KeyEvent.VK_DOWN));				
		}
		else if (type.equals("LeftOpen")) {
			room = new Room(x,y);
			room.setSide(new Wall(KeyEvent.VK_UP));
			room.setSide(new Wall(KeyEvent.VK_RIGHT));			
			room.setSide(new Wall(KeyEvent.VK_DOWN));				
		}
		else if (type.equals("RightAndLeftOpen")) {
			room = new Room(x,y);
			room.setSide(new Wall(KeyEvent.VK_UP));	
			room.setSide(new Wall(KeyEvent.VK_DOWN));				
		}
		else if (type.equals("BottomOpen")) {
			room = new Room(x,y);
			room.setSide(new Wall(KeyEvent.VK_UP));
			room.setSide(new Wall(KeyEvent.VK_RIGHT));			
			room.setSide(new Wall(KeyEvent.VK_LEFT));				
		}
		else if (type.equals("TopOpen")) {
			room = new Room(x,y);
			room.setSide(new Wall(KeyEvent.VK_LEFT));
			room.setSide(new Wall(KeyEvent.VK_RIGHT));			
			room.setSide(new Wall(KeyEvent.VK_DOWN));				
		}
		else if (type.equals("NoWalls")) {
			room = new Room(x,y);						
		}
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
