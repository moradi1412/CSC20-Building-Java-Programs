import java.util.*; 

public class student {
    private int id; 
    public student (int id){
        this.id = id; 
    }
    public static String toString(int i) {
        return super.toString() + "\nStudent id : " + id ; 
    }
    // public boolean equals(student s){
    //     return this.id == s.id; 
    // }
    
}

class driver {
    public static void main(String[] args) {
        student s1 = new student(123); 
        student s2 = new student(123); 
        boolean b = s1.equals(s2); 
        System.out.println(b);
        //if the boolan is not defined method , then the application will use the object method 
        //boolean equals where it will compare the reference memory of two obj created. 
        System.out.println(s1.toString());
     

        Object o;
        //as Object is the superclass in any java application, you can access through Object and create new subclass 
        o = new student(786); 
        o = "hello" ; 
        o = new Random();  

        
    }

}
