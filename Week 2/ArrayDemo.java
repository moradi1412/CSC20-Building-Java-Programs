import java.util.*;
//Write a program to prompt the user to get the exam score for 20 students.
// your program should display how many students got below average score and how many got above average score. 
//the following needs to be done

public class ArrayDemo {
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //declaration 
        //practice to delcare the size of array separtely 
        int size = 5; 
        double[] student = new double [size];  //[size of the array] 

        //declaring and add vaule directly 
        // double []student = {5.00,6.00, 7,00}
        //single value
        //student [0] = 8.00; 

        for (int i = 0; i < student.length; i++) {
            int studentCount = 1; 
            System.out.println("Enter the exam score for student" + studentCount);
            studentCount++; 
            student[i] = userInput.nextDouble(); 
        }

        double sum = 0; 
        for (int i = 0; i < student.length; i++) {
            sum = sum + student[i]; 
        }

        double average = sum/student.length; 
        System.out.println("the average is :" + average);

        int aboveAverage = 0 ;  
        int belowAverage = 0 ;  
        for (int i = 0; i < student.length; i++) {
            if (student[i] > average){ 
                aboveAverage++; 
            }
            else 
                belowAverage++; 
        }

        System.out.println("number of student above: " + aboveAverage);
        System.out.println("number of student below: " + belowAverage);


    }
}
