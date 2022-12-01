import java.util.*;

public class exceptionHandling {
    
}
class Driver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        try {
            System.out.println("enter an integer");
            int x = input.nextInt(); 
        }
        catch (InputMismatchException e) {
            System.out.println("incorrect, enter an integer");
        }
        
    }
}