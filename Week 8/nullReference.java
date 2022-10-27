public class nullReference {
    
}


 class nullR {
    public static void main(String[] args) {
        String s = null; 
        System.out.println(s);
        Student timmy = new Student();
        System.out.println(timmy.name);
        //run time error because null 
        int length = timmy.name.length(); 

        student s2 = null; 
        if (s2 != null){
            
        }
    }
 } 

class Student {
    String name;
    int id;
}
