package lab;


import java.util.ArrayList;



public class S_ConcreteIterator extends AbstractIterator {
	private int index = 0;
	private ArrayList<AbstractShape> list;
	
	public S_ConcreteIterator(Square root){
		list = new ArrayList<AbstractShape>();
		root.getListOfShapes(list);
	}
	@Override
	public void first() {
		index=0;
		
	}

	@Override
	public void next() {
		if(index<list.size()){
			index++;
		}
		
	}

	@Override
	public boolean isDone() {
		if (index>=list.size()) return true;
		else return false;
	}

	@Override
	public Object currentItem() {
		return list.get(index);
	}

}
