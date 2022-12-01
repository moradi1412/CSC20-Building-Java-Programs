import java.util.Stack;
import java.util.ArrayList;

public class maxStack
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
      System.out.println(num);
      int max = max(num);
      System.out.println(max);
      System.out.println(num);
   }
   public static int max(Stack s)
   {
      ArrayList<Integer> list = new ArrayList<Integer>();
      int max = (int)s.peek();
      while(!s.empty())
      {
         int num =(int) s.pop();
         if(num > max)
            max = num;
         list.add(num);   
      }
      for(int i = list.size() -1 ; i>= 0; i--)
         s.push(list.get(i));
      return max;   
   }
}