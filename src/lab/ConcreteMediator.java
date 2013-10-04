package lab;

import java.util.ArrayList;

public class ConcreteMediator implements AbstractMediator {

	private ArrayList<LadyBird> list;
	public ConcreteMediator(){
		list = new ArrayList<>();
	}
	@Override
	public void collide(LadyBird ladyBird) {

		for(int i = 0;i<list.size();i++){
			if(!ladyBird.equals(list.get(i))){  //awful way??
				list.get(i).collide(ladyBird);
			
			}
		}
	}

	@Override
	public void registerLadyBird(LadyBird ladyBird) {
		list.add(ladyBird);

	}

}
