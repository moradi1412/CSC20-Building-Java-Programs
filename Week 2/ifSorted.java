import java.util.*;

// write a program that has a method isSorted. 
//this method gets an array of integers returns true if the array is sorted and returns false otherwise

public class ifSorted
{
   public static void main(String[] args)
   { 
       int[] a = {1,2,3,4,5}; 
       //will conut the size of array start with 1, not 0
       System.out.println(a.length);
       boolean b = isSortedBoolean(a) ; 
       if (b){
        System.out.println(a + " in the main method");        
   }
}
   //1 2 -1 45 67
   public static boolean isSortedBoolean(int[] num)
   {
      for(int i = 0; i < num.length -1 ; i++)
      {
        if(num[i] > num[i+1])
          return false;
      }
      return true;
      
   }
                       
}    