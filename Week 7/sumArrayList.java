import java.util.*;

public class sumArrayList {
    public static void main(String[] args)
{
     ArrayList<Double> nums = new ArrayList<Double>();
//initializing the arraylist
     nums.add(3.00);
     nums.add(5.00);
     nums.add(6.00);
     nums.add(7.00);
//calling the method sum and passing the arrayList
     sum(nums); 
}
public static void sum(ArrayList<Double> nums)
{
      double sum = 0;
      for(int i = 0; i < nums.size(); i++)
      {
        sum = sum + nums.get(i);
      }
      System.out.println("The sum of :" + nums);
      System.out.println(sum);

      double average = sum / nums.size(); 
      
      
      System.out.println("The average of :" + average);
     
      
 }

    
}
