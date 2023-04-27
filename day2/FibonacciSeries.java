package week1.day2;

public class FibonacciSeries {

	public static void fibbo(int range) {
		int n1=0;
		int n2=1; 

		for (int i = 2; i < range; i++) {

			int n3=n1+n2;
			 System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
	}

	public static void main(String[] args) {

		FibonacciSeries obj=new FibonacciSeries();
		obj.fibbo(8);
	

	}

}
