import java.util.*;

public class changeArraySize
{
  public static void main(String[] args)
  {
     Scanner kb = new Scanner(System.in);
     String[] songs = new String[5];
     //initializing the array
     for(int i = 0; i <songs.length;i++)
     {
         System.out.print("Enter the song: ");
         songs[i] = kb.nextLine();
     }
    // songs = new String[10];
     //resizeing the array
     //1. copy all the elements into another array
     String[] copy = new String[songs.length * 2];
     for(int i = 0; i <songs.length; i++)
     {
        copy[i] = songs[i];
     }
     //3. copy the  reference in to the original array
     songs = copy; 
     System.out.println(Arrays.toString(songs));      
        
  }
   
} 