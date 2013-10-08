package lab;

import java.awt.Graphics;

public class S_ConcreteVisitor extends AbstractVisitor {

	Graphics g;
	public S_ConcreteVisitor(Graphics g){
		this.g=g;
		
	}
	@Override
	public void visit(Square s) {
		s.paint(g);
		
	}

	@Override
	public void visit(Rectangle r) {
		r.paint(g);
		
	}

	@Override
	public void visit(Circle c) {
		c.paint(g);
		
	}

	@Override
	public void visit(Triangle t) {
		t.paint(g);
		
	}

}
