import myCodes.scientificCalculator;

public class testScientificCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double iresult;
		scientificCalculator sc = new scientificCalculator();
		//from scientificCalculator class
		iresult =sc.addDouble(9299233.98 ,8765543.78);
		System.out.println(iresult);
		//from calculator class
		iresult = sc.add(999, 8987777657762.98);
		System.out.println(iresult);
		
		iresult = sc.add(5,10);
		System.out.println(iresult);
		
		
	}

	
	
}
