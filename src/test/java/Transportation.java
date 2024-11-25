public abstract class Transportation {
	String name;
	Transportation (String name) {
		this.name=name;
	}
	//abstract method. The classes implementing will have to define
	abstract void move();
	
	//This is a concrete method
	
	public void transportMode(boolean isPublicTransportation)
	{
		System.out.println(isPublicTransportation);
	}
}
