package lab;

import java.awt.event.KeyEvent;

public class S_ConcreteStableBuilder extends S_StableBuilder {

	@Override
	public void buildRoom(int x, int y) {
		stable.addRoom(new Room(x,y));
		this.buildWalls(x, y);
	}

	@Override
	public void buildDoors(int x1, int y1, int x2, int y2, String type) {
		Room room1 = stable.getRoom(x1, y1);
		Room room2 = stable.getRoom(x2, y2);
		
		if (room1 != null && room2 != null)
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
		}		
	}

	@Override
	public void buildWalls(int x, int y) {
		Room room = stable.getRoom(x, y);
		if(room != null){
			room.setSide(new Wall(KeyEvent.VK_UP));
			room.setSide(new Wall(KeyEvent.VK_LEFT));			
			room.setSide(new Wall(KeyEvent.VK_RIGHT));			
			room.setSide(new Wall(KeyEvent.VK_DOWN));	
		}
	}

	@Override
	public void setSides(int x1, int y1, int x2, int y2) {
		Room room1 = stable.getRoom(x1, y1);
		Room room2 = stable.getRoom(x2, y2);
		
		if (room1 != null && room2 != null)
		{
				room1.setSide(room2);
				room2.setSide(room1);		
			
		}			
	}
}
