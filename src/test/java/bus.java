class bus extends Transportation {

	  int totalWheels;
	  bus(String name,int totalWheels){
	   super(name);
	   
	   this.totalWheels=totalWheels;
	}
	void move(){
	  System.out.println("My "+name+" Bus is running on "+totalWheels+" Wheels");
	}
	
	
	

}
