package lab;

public class GoingState extends AbstractState {

	@Override
	public void nextAction(LadyBird bird) {
		if(!bird.turn()) bird.setState(new TurningState());
		else if(bird.go()) bird.setState(new StandingState());

	}

}
