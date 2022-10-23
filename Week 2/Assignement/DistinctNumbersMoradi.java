/*
Name: Mohammad Javid Moradi 
Date: September 11, 2022
description: Assignment # 1 - Distinct numbers 
A program that will allow user to number numbers 
self grade: 90 

Testimony: I have written this program all by myself and have not copied any code from any resourses: __Mohammad Javid Moradi__ 
*/
//importing Scanner from the libary to get the user input
import java.util.Scanner;
import java.util.*;
public class DistinctNumbersMoradi
{
  //Main Method 
   public static void main(String[] args)
   {
     //welcome prompt and what program does.
     System.out.println("Welcome to the distinct numbers. \nI will remove the repeated numbers and display the numbers you just entered. "); 
     System.out.println("As long as you have not entered 10 distinct numbers I will keep prompting you to enter a number");

     //Array declaration and length
     int[] num = new int[10]; 
     int counter = getInput(num);  
   }


public static boolean isDistinct(int[] array, int num) {
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) 
				return false;
		}
		return true;
	}
 

  
 public static int getInput(int[] numbers)
 {
   Scanner userInput = new Scanner(System.in);
  
   int counter = 0; 
   int index = 0; 
   
   //for loop for checking the boolean to ensure the number is distinct 
   for(int i = 0; i < numbers.length; i++)
   {
      
      System.out.print ("Enter a number : ");
      int userNum = userInput.nextInt();
      boolean check = isDistinct(numbers, userNum); 
      if (check == true) {
      numbers[index] = userNum;
     index++;
   }
   // if not excute to ask for another input. 
   else {
   System.out.print ("Enter a number : ");
      int repted = userInput.nextInt();
      numbers[index] = repted;
       index++; 
   }
    counter++; 
    
   } 
 
    System.out.println( counter); 
     display(numbers,counter);
   
   return counter; 
 } 
 
 
 //method to display the result. 
 public static void display(int[] num, int counter)
   {
     System.out.println("Mohammad Javid Moradi"); 
     System.out.println(" You entered " + counter + " numbers total, I filtered out all the repeated numbers. \n Here is the list of distinct number you entered");
     System.out.println (Arrays.toString(num));
   }
} 
 
