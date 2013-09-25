package lab;

public class TurningState extends AbstractState {

	@Override
	public void nextAction(LadyBird bird) {
		bird.turn();
	}

}
