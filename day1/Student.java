package week1.day1;

public class Student {

	String Name="Vijay S";
	long Rollno=12345678l;
	String Clgname="Anna University";
	int markscored=85;
	double Cgpa=7.6;

	public static void main(String[] args) {
		Student obj=new Student();
		System.out.println(obj.Name);
		System.out.println(obj.Rollno);
		System.out.println(obj.Clgname);
		System.out.println(obj.markscored);
		System.out.println(obj.Cgpa);
	}

}
