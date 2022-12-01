import java.util.*;
public class StackCopy2
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
      System.out.println("before " + num);
      Stack c = copy(num);
     
      System.out.println(c);
    }
    public static Stack copy(Stack s)
    {
       ArrayList<Integer> list = new ArrayList<Integer>();
       Stack<Integer> c = new Stack<Integer>();
       while(!s.empty())
       {
          list.add((Integer)s.pop());
       }
       for(int i = list.size() -1; i >= 0; i--)
       {
          s.push(list.get(i));
          c.push(list.get(i));
       }
       return c;
    }
}   