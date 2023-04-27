package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
		int A[]= {3,2,11,4,6,7};	 // a) Declare An array for {3,2,11,4,6,7};	 
		int B[]= {1,2,8,4,9,7};	    //b) Declare another array for {1,2,8,4,9,7};

			for (int i = 0; i < B.length; i++) {     // c) Declare for loop iterator from 0 to array length

				for (int j = 0; j < B.length; j++) { //d) Declare a nested for another array from 0 to array length

					if (A[i]==B[j]) {                 //Compare Both the arrays using a condition statement
						System.out.println("The intersection is:  "+A[i]);   //Print the first array (shoud match item in both arrays)

					}

				}


			}
	}

}
