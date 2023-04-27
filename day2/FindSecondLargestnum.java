package week1.day2;

import java.util.Arrays;

public class FindSecondLargestnum {

	public static void main(String[] args) {
	int len[]={23,45,67,32,89,22 };
	int length=len.length;
	Arrays.sort(len);

	for (int i = 0; i < len.length; i++) {	
		System.out.println(len[i]);	
	}
		 System.out.println("second largest num:  "+len[length-2]);
	}

}
