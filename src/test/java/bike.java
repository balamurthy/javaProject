
public class bike extends Transportation{
	 int totalWheels;
	  
	 bike(String name,int totalWheels){
	   super(name);
	     this.totalWheels=totalWheels;
	  }
	@Override
	void move() {
		// TODO Auto-generated method stub
		
		 System.out.println("My "+name+" bike is running on "+ totalWheels +" Wheels");
		
		
	}

}
