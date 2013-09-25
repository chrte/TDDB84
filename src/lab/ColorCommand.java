package lab;

import java.awt.Color;

public class ColorCommand extends AbstractCommand {

	private LadyBird l;
	private Color oldColor;
	private Color oldDotColor;

	@Override
	public void Execute() {
		LadyBirdManager lm = LadyBirdManager.instance();
		l = lm.getMarkedLadyBird();
		oldColor = l.getColor();
		oldDotColor= l.getDotColor();
		l.setColors(new Color(5,30,201), new Color(205,83,101));

	}

	@Override
	public void Unexecute() {
		l.setColors(oldColor, oldDotColor);
	}

}
