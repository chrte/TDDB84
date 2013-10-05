package lab;

public class S_SmallerCommand extends AbstractCommand {

	private LadyBird l;
	private int oldSize;
	

	@Override
	public void Execute() {
		LadyBirdManager lm = LadyBirdManager.instance();
		l = lm.getMarkedLadyBird();
		oldSize = l.getSize();
		if(oldSize > 18)
			l.setSize(oldSize-1);		

	}

	@Override
	public void Unexecute() {
		l.setSize(oldSize);
	}

}
