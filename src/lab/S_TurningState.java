package lab;

public class S_TurningState extends AbstractState {

	@Override
	public void nextAction(LadyBird bird) {
		if(bird.turn()) bird.setState(new S_GoingState());
	}

}
