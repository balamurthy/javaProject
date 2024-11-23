import myCodes.calculator;

public class myCalculatorTest {

	static int iresult ;	
	static double dresult;
	
	
	public static void main(String[] args) {
		int exp_iresult = 5;
		calculator c = new calculator();
		
		try {
			iresult = c.add(1,3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	System.out.println("Expected is " + exp_iresult + " Actual iresult is : " + iresult);
	
	if (iresult==exp_iresult)
	{
	     System.out.println("iResult is passed");
	     
	}
	else {
		 System.out.println("iResult is failed");
		    
	}
	
	iresult = c.add(5,7,8);
	System.out.println("iResult is "  + iresult);
	
	/*
	dresult = c.add(30000000, 3.625252);
	System.out.println("dResult is " + dresult);

	String newString=c.joinstrings("harry", "potter");
	
	System.out.println("concatenated " + newString);
	*/
	}
	
	
}
