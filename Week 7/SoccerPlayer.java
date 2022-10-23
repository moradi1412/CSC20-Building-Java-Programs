import java.util.*;
import java.util.ArrayList;

public class SoccerPlayer implements Comparable
{
   private String name;
   private int number;
   public SoccerPlayer(String name,int number)
   {
     this.name = name;
     this.number = number;
   }
   public String getName()
   {
     return name;
   }
   //compareto method can be used to sort palyers  alphabetically
   public int compareTo(Object o)
   {
        
        SoccerPlayer s = (SoccerPlayer)o;
        return this.name.compareTo(s.name); // comparing the name of the palyers alphabetically
   }
   public String toString()
   {
   return name + " " +number;
   }
 }
 class Driver
 {
    public static void main(String[] args)
    {
       //declaring and instantiating
       ArrayList<SoccerPlayer> bearcat = new ArrayList<SoccerPlayer>();
       Scanner kb = new Scanner(System.in);
       
       //initializing the bearCat ArrayList with players' name and number. The names are being added in the
       //alphabetical order
       for(int i = 0; i <= 4; i++)
       {
          //getting the player information
          System.out.print("Enter the name and the number for the player: ");
          String n = kb.next();
          int number = kb.nextInt();
          //creating an object of SoccerPlayer
          SoccerPlayer s = new SoccerPlayer(n,number); // creating a soccerPlayer object
          //if the list is empty just add it to the beginning of the list
          if (i == 0)
          {
             bearcat.add(s);
             continue;  //control flow will go to the beginning of the loop
          } 
          boolean added = false;
          //if the list has elements in it, find the proper position to add the element
         // System.out.println(bearcat);
          for(int j = 0;  j < bearcat.size(); j++)
          {
            //find the proper position to add the elment to the list
            if(s.compareTo(bearcat.get(j)) < 0)  //checking to see if the element should be added in the middle of the list
            {
               bearcat.add(j,s);
              added = true;
               break;
            }
          } 
          //check to see if the player needs to added to the end of the list
          if(!added)
            bearcat.add(s);
       }
       //display the list of the players on the screen
       System.out.println(bearcat);
     }
 }

