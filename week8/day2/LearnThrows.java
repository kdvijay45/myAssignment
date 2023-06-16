package week8.day2;

public class LearnThrows {

	public static void main(String[] args) {
	    int x=10;
	    int y=0;
	    int[] nums= {10,20,30};
	    try {
	        System.out.println(x/y);
	    
	    try {
	        System.out.println(nums[3]);
	    } catch (ArithmeticException e) {
	        System.out.println(e);
	    }
	    }
	    catch(Exception e) {
	        System.out.println(e);
	    }
	    finally {
	        System.out.println("End of program");
	    }
	}
}
	