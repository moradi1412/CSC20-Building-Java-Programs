import java.util.Scanner;
//Write a program that reads the height and the weigh of the two people and calculates the body mass index.
//the output of the program should be similar to the following. BMI = 703 * weight / height2  

public class CountingBMI {
    public static void main(String[] args) {

    Scanner userInput = new Scanner(System.in); 
    
    System.out.println("Enter your name: ");
    String name = userInput.next(); 
     
    System.out.println("Enter your weight: ");
    double weight = userInput.nextDouble(); 

    System.out.println("Enter your height: ");
    double height = userInput.nextDouble(); 

    double bmi = 703 * weight / Math.pow(height, 2); 

    System.out.println(name + ": Your body mass index is : " + bmi);
    }
    
}
