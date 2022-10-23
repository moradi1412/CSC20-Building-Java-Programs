import java.util.*;
public class CopyArray
{
   public static void main(String[] args)
   { 
     //copy primitive data type 
     int x = 10; 
      int y = x;
   
     //creating two different names for the same array
     int[] a = {1,4,3,4};
     int[] b = a;
     
     a[0] = 100;
     b[1] = 44;
     
     //creating a copy of an array
     int[] scores = {1,2,3,4,5,6,7,8};
     int[] cop  =copy(scores);
     scores[0] =100;
     cop[2] =1000;
      
                      
   }
   public static int[] copy(int[] a)
   {
     int[] b = new int[a.length];
     for(int i = 0; i < a.length; i++)
          b[i] = a[i];
     return b;     
   }
              
                           
}  