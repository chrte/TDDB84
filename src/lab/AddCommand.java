package lab;

public class AddCommand extends AbstractCommand {

	LadyBird l;
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
