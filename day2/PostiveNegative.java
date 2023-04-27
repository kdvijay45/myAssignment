package week1.day2;

public class PostiveNegative {

	public static void main(String[] args) {
		//Check if the number is positive or negative
		int number=35;                                   //Initialize a number, say, int number= 35
		if(number>0) {
			System.out.println("The Number is Positive:  "+number);  //If a number is positive
		}
			else if (number<0) {
				System.out.println("The Number is Negative:  "+number); //If a number is negative
			}
				else {
					System.out.println(" The number is neither positive nor negative: "+number); //If it nether negative nor positive
				}
	

	}

}
