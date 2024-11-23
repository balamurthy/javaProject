package myCodes;

public class calculator {

	
	//Variables
	
	
	public int add(int num1,int num2)
	{
		return num1 + num2;
	}
	
	public int add(int num1,int num2,int num3)
	{
		System.out.println("iResult is calling the 3 param add method");
		return num1+num2+num3 ;
	}
	
	public double add(int num1,double num2)
	{
		
		System.out.println("In double add");
		return num1 + num2;
		
		
	}
	
	
	public String joinstrings (String a,String b)
	{
		return (a.concat(b));
	}
	
}
