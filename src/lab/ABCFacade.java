package lab;

import java.awt.Color;
import java.awt.Rectangle;
import java.util.AbstractList;
import java.util.ArrayList;

public class ABCFacade implements Renderer {

	private ModuleA moduleA;
	private ModuleB moduleB;
	private ModuleC moduleC;

	public ABCFacade(){
		moduleA = new ModuleA();
		moduleB = new ModuleB();
		moduleC = new ModuleC();
		new Thread(moduleA).start();
	}

	@Override
	public void putBackground() {
		moduleA.drawBackground();

	}

	@Override
	public void putBody(AbstractList<Rectangle> body) {
		moduleB.drawSnake(body);

	}

	@Override
	public void setSnakeColor(Color color) {
		// TODO Auto-generated method stub

	}

	@Override
	public void putBonus(AbstractList<Rectangle> bonus) {
		ArrayList<Rectangle> bonuses = (ArrayList<Rectangle>) bonus;
		moduleC.putBonus(bonuses);

	}

	@Override
	public void outside() {


	}

	@Override
	public void stop() {
		moduleA.stop();

	}

}
