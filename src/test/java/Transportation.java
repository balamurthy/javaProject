
public abstract class Transportation {

	
	String name;
	Transportation (String name) {
		this.name=name;
	}
	
	abstract void move();
	public void transportMode(boolean isPublicTransportation)
	{
		System.out.println(isPublicTransportation);
	}
}
