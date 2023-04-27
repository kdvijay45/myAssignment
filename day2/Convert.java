package week1.day2;

public class Convert {

	public static void main(String[] args) {
        int Input=-40;    //Initialize an integer with a negative number like, int number = -40

     	if (Input<0) {    //Check if the number is a negative number Hint : any number that is lesser than zero is a negative number
		System.out.println("Negative number is:  "+Input);
        Input=Input*-1;    		//If so, convert the number to a positive number

}
System.out.println("The negative number is converted into positive number: "  +Input);// Print as below "The number -40 is converted to 40"


}

}
