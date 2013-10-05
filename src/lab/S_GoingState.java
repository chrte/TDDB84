package lab;

public class S_GoingState extends AbstractState {

	@Override
	public void nextAction(LadyBird bird) {
		if(!bird.turn()) bird.setState(new S_TurningState());
		else if(bird.go()) bird.setState(new S_StandingState());

	}

}
