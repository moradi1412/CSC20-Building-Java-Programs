import java.util.*;


public class ArrayListMethods {
    public static void main(String[] args) {
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
        
    }
    
}
