package lab;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.AbstractList;
import java.util.Iterator;



// YOUR CODE HERE
// Extends? Implements?
class Graphics3DAdapter extends AbstractGraphics implements Renderer {

	private Color snakeColor = Color.blue;
	private Color bonusColor = Color.red;
	private Color backgroundColor = Color.gray;
	private Graphics3D graphics3D;

	public Graphics3DAdapter(){
		this.graphics3D = new Graphics3D();
	}
	@Override
	public void putBody(AbstractList<Rectangle> body) {
		Rectangle r;
		
		Iterator<Rectangle> iterator = body.iterator();
		while (iterator.hasNext()) {
			r = iterator.next();
//			g.fillRect(r.x, r.y, r.height, r.width);
			graphics3D.printBox(new Box(r.x, r.y, r.x + r.width, r.y + r.height), snakeColor);
		}
	}


	@Override
	public void putBonus(AbstractList<Rectangle> bonus) {

		Rectangle r;
		
		Iterator<Rectangle> iterator = bonus.iterator();
		
		while (iterator.hasNext()) {
			r = iterator.next();
//			g.fillRect(r.x, r.y, r.height, r.width);
			graphics3D.printBonus(new Box(r.x, r.y, r.x + r.width, r.y + r.height), bonusColor);
		}
		
	}



	@Override
	public void putBackground() {
		graphics3D.printBase(this.backgroundColor);
		
	}

	@Override
	public void stop() {
		
		
	}


	// YOUR CODE HERE
	// Overwrite some of the inherited/implemented methods.
}
