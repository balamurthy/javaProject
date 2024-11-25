
public class encapsulationExample {
	
	private Double accountnumber;
	private int accountbalance;
	
	
	public void createNewAccountnumber()
	{
		accountnumber= Math.random();
		
		String[] div = accountnumber.toString().split("\\.");
		 
		System.out.println("Account created - " + div[1]);
	}
	
}
