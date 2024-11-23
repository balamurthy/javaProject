package myCodes;
//inheritance example

public class scientificCalculator extends calculator {

	public int add(int num1,int num2)
	{
	
		System.out.println("I am executing from scientific calc add int and int");
		return num1 + num2;

	
	}
	
	public double addDouble(double n1,double n2)
	{
		return n1+n2;
	}
	
	
}
