package week7.day2;

public class LearningConstrutor {
    
    int id;
    String name;
    public void printData() {
    
        
    }
    public void setData() {
    
        this.printData();
        
        
    }
    public LearningConstrutor() {
        
        System.out.println("Body of the default constructor");
        
    }
    public LearningConstrutor(int id,String name) {
        this.id=id;
        
        this.name=name;
    
    }
    public static void main(String[] args) {
        System.out.println("before creating object");
        
        LearningConstrutor obj=new LearningConstrutor(1011,"Vijay");
        System.out.println(obj.id);
        System.out.println(obj.name);
        
    }
    
}