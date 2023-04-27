package week1.day2;

public class Primenum {

	public static void main(String[] args) {

		int num=13;                                                          // Declare an int Input and assign a value 13

		boolean flag=false;                                                 // Declare a boolean variable flag as false

		for (int i = 2; i <=num/2; i++) {                                   // Iterate from 2 to half of the input

			if(num%2==0) {                                                 // Divide the input with each for loop variable and check the remainder

				flag=true;                                               // Set the flag as true when there is no remainder
				break;                                                  // break the iterator
			}		
		}
		if (!flag) {                                                  // Check the flag (Provide a condition)

			System.out.println("It is a prime number"+num);          // Print 'Prime' when the condition matches

		}
			else {
				System.out.println("It is not a prime number"+num); // Print 'Not a Prime' when the condition doesn't match 
			}

	}

}
