package week1.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// Here is the input
				int[] arr = {1,2,3,4,7,6,8};
				int n=arr.length+1;
				int sum=(n*(n+1)/2);
				// Sort the array	
				Arrays.sort(arr);
				for (int i = 0; i < arr.length; i++) {
					System.out.println(arr[i]);

				}

				for (int i = 0; i < arr.length; i++) {
					sum=sum-arr[i]; // loop through the array (start i from arr[0] till the length of the array)				
			}
				System.out.println("Missing number is:" +sum); // print the number


	}

}
