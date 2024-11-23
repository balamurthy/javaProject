import java.util.Scanner;

enum Severity {
  LOW,
  MEDIUM,
  HIGH,
  CRITICAL
}

public class enumSwitch {
  public static void main(String[] args) {
	  
	  Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.print("Enter severity:");

	  
	 String myVar =myObj.nextLine();
	     	
	 Severity ev = Severity.valueOf(myVar);	
	     	
    switch(ev) {
      case LOW:
        System.out.println("Low level");
        break;
      case MEDIUM:
         System.out.println("Medium level");
        break;
      case HIGH:
        System.out.println("High level");
        break;
      default:
    	  System.out.println("None");
        
    }
  }
}