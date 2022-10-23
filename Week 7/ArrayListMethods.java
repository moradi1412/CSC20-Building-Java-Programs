import java.util.*;
import java.util.ArrayList; 



public class ArrayListMethods {
    public static void main(String[] args) {
        //declaration of arraylist of String 
        ArrayList<String> list = new ArrayList<String>(); 
        Scanner input = new Scanner(System.in); 
        songs(list,input); 
    }


    public static void songs(ArrayList<String> myList, Scanner input) {
        boolean more = true; 
        while (more){
            
            System.out.println("Enter the songs : "); 
            String song = input.nextLine();
            myList.add(song);
            System.out.println("Do you have more songs : ");
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase("no")){
                more = false; 
            }

        }

        myList.add("baby got your back");
        myList.add(3,"incomplete");

        //change the value at the index 
        myList.set(0, "Hello"); 

        //getting the size of the arraylist 
        int size =  myList.size(); 

        //getting the value of an index. 
        String s = myList.get(2); 

        myList.remove(1); 

        

        System.out.println(myList);
        
    }
    
}
