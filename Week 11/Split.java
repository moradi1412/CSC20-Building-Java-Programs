import java.util.*;

/*Write a method splitStack that takes a stack of integers as a parameter and splits it into negatives and non-negatives.
The numbers in the stack should be rearranged so that all the negatives appear on the bottom of the stack and all
the non-negatives appear on the top. In other words, if after this method is called you were to pop numbers off the stack,
you would first get all the nonnegative numbers and then get all the negative numbers. It does not matter what order the numbers
appear in as long as all the negatives appear lower in the stack than all the non-negatives.
You may use a single ArrayList as an extra storage.*/

public class Split
{
   public static void main(String[] atgs)
   {
      Stack<Integer> num = new Stack<Integer>( );
      num.push(-1);
      num.push(4);
      num.push(44);
      num.push(-55);
      num.push(10);
      num.push(-45);
      num.push(10);
      split(num);
      System.out.println(num);
   }
   public static void split(Stack   myStack)
   {
      ArrayList<Integer> list = new ArrayList<Integer>();
      while(!myStack.empty())
      {
        int n = (int)myStack.pop();
        if( n  > 0)
          list.add(n);
        else
          list.add(0,n);  
      }
      for(int i = 0; i < list.size(); i++)
      {
        int n = list.get(i);
        myStack.push(n);
      }
   }
}