package lab;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import javax.swing.JPanel;



/**
 * This is the class where the students should make changes.
 * Does the double buffering of the graphics.
 *
 * @author Peter Sunnergren
 */
public class StablePanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private static Image offscreen;
	private static Graphics buffer;
	private Dimension dimension;
	private ArrayList<Horse> horses;

	public StablePanel(StableApplet a) {

		dimension = new Dimension(800, 800);
		setMinimumSize(dimension);
		offscreen = a.createImage((int)dimension.getWidth(), (int)dimension.getHeight());
		buffer = offscreen.getGraphics();
		horses = new ArrayList<Horse>();
	}

	/**
	 * This method draws the stable, the person and the horses.
	 */
	public void paint(Graphics g) {

		buffer.clearRect(0, 0, dimension.width, dimension.height);
		Stable.instance().paint(buffer);

		Iterator<Horse> iterator = horses.iterator();

		while (iterator.hasNext())
			iterator.next().paint(buffer);

		Person.instance().paint(buffer);

		g.drawImage(offscreen, 0, 0, this);
	}

	/**
	 * This is called when the user presses 'h' and adds another horse.
	 */
	public void addHorse(StableApplet a) {

		Horse horse1 = new Horse(a);
		horses.add(horse1);
		new Thread(horse1).start();
	}

	/**
	 * Constructs the stable using the default implementation.
	 * In this method the students can see how a small stable
	 * is constructed in a nonflexible manner.
	 */
	public void defaultConstruction() {

		Room room1 = new Room(0,0);
		Room room2 = new Room(1,0);
		Room room3 = new Room(0,1);
		Room room4 = new Room(1,1);

		Door door13 = new Door(room1, room3);
		BoxDoor boxDoor24 = new BoxDoor(room2, room4);
		BoxDoor boxDoor34 = new BoxDoor(room3, room4);

		Stable.instance().addRoom(room1);
		Stable.instance().addRoom(room4);
		Stable.instance().addRoom(room3);
		Stable.instance().addRoom(room2);

		room1.setSide(new Wall(KeyEvent.VK_UP));
		room1.setSide(new Wall(KeyEvent.VK_LEFT));

		room2.setSide(new Wall(KeyEvent.VK_UP));
		room2.setSide(new Wall(KeyEvent.VK_RIGHT));

		room3.setSide(new Wall(KeyEvent.VK_DOWN));
		room3.setSide(new Wall(KeyEvent.VK_LEFT));

		room4.setSide(new Wall(KeyEvent.VK_RIGHT));
		room4.setSide(new Wall(KeyEvent.VK_DOWN));

		room1.setSide(room2);
		room2.setSide(room1);

		room1.setSide(door13);
		room3.setSide(door13);

		room2.setSide(boxDoor24);
		room4.setSide(boxDoor24);

		room3.setSide(boxDoor34);
		room4.setSide(boxDoor34);
	}

	/**
	 * Construction is made using an Factory.
	 */
	public void factoryConstruction() {
		
		S_StableFactory stable = new S_StableFactory();
		
		Room room1 = stable.createRoom(0,1,"RightOpen");
		Room room2 = stable.createRoom(1,1,"NoWalls");
		Room room3 = stable.createRoom(2,1,"NoWalls");
		Room room4 = stable.createRoom(0,0,"BottomOpen");
		Room room5 = stable.createRoom(0,2,"TopOpen");
		
		Room horseBox1 = stable.createRoom(3,1,"LeftOpen");
		Room horseBox2 = stable.createRoom(2,0,"BottomOpen");
		Room horseBox3 = stable.createRoom(1,0,"BottomOpen");
		Room horseBox4 = stable.createRoom(2,2,"TopOpen");
		Room horseBox5 = stable.createRoom(1,2,"TopOpen");
		
		BoxDoor boxDoor1 = (BoxDoor) stable.createDoor(room3, horseBox1, "box");
		BoxDoor boxDoor2 = (BoxDoor) stable.createDoor(room3, horseBox2, "box");
		BoxDoor boxDoor3 = (BoxDoor) stable.createDoor(room3, horseBox4, "box");
		BoxDoor boxDoor4 = (BoxDoor) stable.createDoor(room2, horseBox3, "box");
		BoxDoor boxDoor5 = (BoxDoor) stable.createDoor(room2, horseBox5, "box");
		
		Door door1 = stable.createDoor(room1, room4, "door");
		Door door2 = stable.createDoor(room1, room5, "door");
		
		
		room1.setSide(room2);
		room2.setSide(room1);		
				
		room2.setSide(room3);
		room3.setSide(room2);

	}

	
	/**
	 * Construction using the Builder pattern.
	 */
	public void builderConstruction() {

		StableBuilder stable = new S_ConcreteStableBuilder();
		stable.buildStable();
		
		stable.buildRoom(0, 1);
		stable.buildRoom(1, 1);
		stable.buildRoom(2, 1);
		stable.buildRoom(0, 0);
		stable.buildRoom(0, 2);
		
		stable.buildRoom(3, 1);
		stable.buildRoom(2, 0);
		stable.buildRoom(1, 0);
		stable.buildRoom(2, 2);
		stable.buildRoom(1, 2);
		
		stable.buildDoors(2, 1, 3, 1, "box");
		stable.buildDoors(2, 1, 2, 0, "box");
		stable.buildDoors(2, 1, 2, 2, "box");
		stable.buildDoors(1, 1, 1, 0, "box");
		stable.buildDoors(1, 1, 1, 2, "box");
		
		stable.buildDoors(0, 1, 0, 0, "door");
		stable.buildDoors(0, 1, 0, 2, "door");

		stable.setSides(0, 1, 1, 1);
		stable.setSides(2, 1, 1, 1);


		
	}

	/**
	 * Construction using prototypes.
	 */
	public void prototypeConstruction() {

		// YOUR CODE HERE
		S_StablePrototypeFactory<Room> roomProt = new S_StablePrototypeFactory<Room>();
		S_StablePrototypeFactory<Wall> wallProt = new S_StablePrototypeFactory<Wall>();
		// END OF YOUR CODE
	}

	public void deconstruct() {

		Iterator<Horse> iterator = horses.iterator();

		while(iterator.hasNext())
			iterator.next().stop();

		horses.clear();
		Stable.instance().deconstruct();
	}

	// YOUR CODE HERE
	// May be something else is missing?
	// END OF YOUR CODE
}
