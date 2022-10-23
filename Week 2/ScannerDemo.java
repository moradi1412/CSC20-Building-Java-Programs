//libaray for userinput 
import java.util.Scanner; 

public class ScannerDemo {

   static Scanner console = new Scanner(System.in);

    public static void main(String[] args) {       

        System.out.print("How old are you? ");

        int age = console.nextInt();

        int years = 65 - age;

        System.out.println(years + " years to retirement!");

    }
    
}
