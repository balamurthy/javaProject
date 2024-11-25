public class abstractClassesRunner {
	
	public static void main(String[] args)
	{
		car myCar = new car("Audi",4);
		myCar.move();
		myCar.transportMode(false);
		
		bike myBike = new bike("Activa",2);
		myBike.move();
		myBike.transportMode(false);
		
		bus myBus = new bus("TATA",4);
		myBus.move();
		myBus.transportMode(true);
		
		
	}

}
