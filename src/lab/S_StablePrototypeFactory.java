package lab;

public class S_StablePrototypeFactory<Type extends MapSite> {

	private Type prototype;
	public S_StablePrototypeFactory(Type typeIn){

		prototype=typeIn;
	}

	public Type clone(){
		return (Type) prototype.clone();
	}
	
}
