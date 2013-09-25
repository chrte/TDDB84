package lab;

public class GoingState extends AbstractState {

	@Override
	public void nextAction(LadyBird bird) {
		bird.go();

	}

}
