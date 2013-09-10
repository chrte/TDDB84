package lab;

public abstract class StableBuilder {
	
	protected Stable stable;

	 public abstract void buildRooms();
	 
	  public abstract void buildDoors();
	 
	  public abstract void buildWalls();
	 
	  public void buildStable()
	  {
			stable = Stable.instance();	  
	  
	  }
	  
	  public Stable getStable()
	  {
		 return stable; 
	  }
	  
	
}
