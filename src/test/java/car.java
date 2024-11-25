
class car extends Transportation {

	  int totalWheels;
	  car(String name,int totalWheels){
	   super(name);
	     this.totalWheels=totalWheels;
	}
	void move(){
	  System.out.println("My "+name+" car is running on "+totalWheels+" Wheels");
	}
	
	

}
