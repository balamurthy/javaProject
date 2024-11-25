
public class arraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] nums = {1,2,3,4};
		
		System.out.println(nums.length);
		
		for (int i = 0;i <nums.length;i++)
		{
			System.out.println(nums[i]);
		}
		
		//Double dimensional arrays
		String dbl[][] ={ {"one","Ravi"},{"two","Mani"},{"three","Julie"}};
		
		//for each row
		for (int i = 0; i < dbl.length; i++) {
	        // iterate through the columns and print  
			for (int j = 0; j < 2; j++)
	                System.out.print(dbl[i][j] + " ");

	            System.out.println();
	        }
	    }
	}


