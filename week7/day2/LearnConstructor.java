package week7.day2;

public class LearnConstructor {

	    public LearnConstructor() {
	        
	        System.out.println("I am from default Constructor");
	    }
	    public LearnConstructor(String name) {
	        this();
	        System.out.println("one Parameter:"+name);
	        
	    }
	    public LearnConstructor(String name, int id) {
	        this("Testleaf");
	        System.out.println("Two parameter Constructor"+name+id);
	    }
	        
	    int var;
	    public void print() {
	        System.out.println("simple print");
	    }
	    
	    public static void main(String[] args) {
	     
	        LearnConstructor obj=new LearnConstructor("Testleaf",1001);
	        obj.print();
	        System.out.print(obj.var);
	}

}
