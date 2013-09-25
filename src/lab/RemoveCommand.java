package lab;

public class RemoveCommand extends AbstractCommand {

	private LadyBird l;
	@Override
	public void Execute() {
		LadyBirdManager lm = LadyBirdManager.instance();
		l = lm.getMarkedLadyBird();
		lm.removeLadyBird(l);

	}

	@Override
	public void Unexecute() {
		LadyBirdManager lm = LadyBirdManager.instance();
		lm.addLadyBird(l);

	}

}
