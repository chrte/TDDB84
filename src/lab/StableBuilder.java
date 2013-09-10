package lab;

public abstract class StableBuilder {
	
	protected Stable stable;

	 public abstract void buildRoom(int x, int y);
	 
	  public abstract void buildDoors(int x1, int y1, int x2, int y2, String type);
	 
	  public abstract void buildWalls(int x, int y);
	  
	  public abstract void setSides(int x1, int y1, int x2, int y2);
	 
	  public void buildStable()
	  {
			stable = Stable.instance();	  
	  
	  }
	  
	  public Stable getStable()
	  {
		 return stable; 
	  }
	  
	
}
