package lab;

public class S_StablePrototypeFactory<Type extends MapSite> {

		private Type prototype;
		public Type clone(){
			return (Type) prototype.clone();
		}
		public void S_Prototype(Type typeIn){
			prototype=typeIn;
		}
}
