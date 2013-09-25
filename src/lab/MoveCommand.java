package lab;

public class MoveCommand extends AbstractCommand {
	
	private int goalX;
	private int goalY;
	private LadyBird l;
	
	public MoveCommand(int x, int y){
		goalX=x;
		goalY=y;		
	}
	
	
	@Override
	public void Execute() {
		LadyBirdManager lm = LadyBirdManager.instance();
		l = lm.getMarkedLadyBird();
		l.setGoal(goalX, goalY);
		l.setState(new TurningState());
//		if(l.turn()){
//			l.setState(new GoingState());
//			if(l.go()){
//				l.setState(new StandingState());
//			}			
//		}
	
		
	}

	@Override
	public void Unexecute() {
		LadyBirdManager lm = LadyBirdManager.instance();
		

	}

}
