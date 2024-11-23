//Recursion example. 
//Sum of all numbers between 5 and 10

public class recursionExample {
	public static void main(String[] args) {
	    int result = sum(5, 10);
	    System.out.println(result);
	  }
	  public static int sum(int start, int end) {
	    if (end > start) {
	      return end + sum(start, end - 1);
	    } else {
	      return end;
	    }
	  }
}
