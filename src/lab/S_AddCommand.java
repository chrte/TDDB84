package lab;

public class S_AddCommand extends AbstractCommand {

	private LadyBird l;
	@Override
	public void Execute() {
		LadyBirdManager lm = LadyBirdManager.instance();
		l = lm.createLadyBird();
		
	}

	@Override
	public void Unexecute() {
		LadyBirdManager lm = LadyBirdManager.instance();

		lm.removeLadyBird(l);

	}

}
