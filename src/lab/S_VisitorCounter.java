package lab;

public class S_VisitorCounter extends AbstractVisitor {

	private int nrOfVisits = 0;
	
	public int getNrOfVisits(){
		return nrOfVisits;
	}
	@Override
	
	public void visit(Square s) {
		nrOfVisits++;
		
	}

	@Override
	public void visit(Rectangle r) {
		nrOfVisits++;
		
	}

	@Override
	public void visit(Circle c) {
		nrOfVisits++;
		
	}

	@Override
	public void visit(Triangle t) {
		nrOfVisits++;
		
	}
	@Override
	public void visit(SquareProxy sp) {
		nrOfVisits++;
		
	}
	

}
