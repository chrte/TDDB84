package lab;

public class TurningState extends AbstractState {

	@Override
	public void nextAction(LadyBird bird) {
		if(bird.turn()) bird.setState(new GoingState());
	}

}
