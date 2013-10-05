package lab;

import java.awt.Color;

public class S_ColorCommand extends AbstractCommand {

	private LadyBird l;
	private Color oldColor;
	private Color oldDotColor;

	@Override
	public void Execute() {
		LadyBirdManager lm = LadyBirdManager.instance();
		l = lm.getMarkedLadyBird();
		oldColor = l.getColor();
		oldDotColor= l.getDotColor();
		l.setColors(l.getDotColor(),l.getColor());
		
	}

	@Override
	public void Unexecute() {
		l.setColors(oldColor, oldDotColor);
	}

}
