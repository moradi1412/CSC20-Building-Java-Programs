import java.util.Arrays;

public class objectReference {
    
}

class Reference
{
  public static void main(String[] args)
  {
     int[] num = {1,2,3,45};
     System.out.println("The address of the num varibale in the main method: " + num); 
     boolean found = search(num,3);
     words();
        
     
  }
  public static boolean search(int[] a, int n)
  {
    // the array was passed by reference , if anything get chnaged it will reflect to the main array. 
     System.out.println(a);
     System.out.println("Th adderss of the aray a is: "+ a);
     for(int i = 0; i < a.length; i++)
     {
        if(a[i] == n)
           return true;
     }
     return false;
  }

  public static void words() {
    //primative data 
    int [] a = { 1,2,3,4,5}; 
    //reference to object 
  String [] words = { "hello", "bye", "Alex", "Mary"}; 
  System.out.println(Arrays.toString(words));  
  }
}