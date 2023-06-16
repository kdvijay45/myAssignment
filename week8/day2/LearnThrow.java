package week8.day2;

public class LearnThrow {

		public int division(int num1,int num2) {
	        int result;
	        if(num1>num2) {
	            result=num1/num2;
	        }
	        else {
	            throw new ArithmeticException("Input is not valid");
	        }
	        return result;
	    }    
	    public static void main(String[] args) {
	        LearnThrow obj=new LearnThrow();
	        int division;
	        try {
	            division = obj.division(5, 25);
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        //System.out.println(division);
	}

}
