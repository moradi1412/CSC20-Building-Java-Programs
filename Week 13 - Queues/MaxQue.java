import java.util.*;
import java.util.Stack;


public class MaxQue { 
}

class Driver1
{
  public static void main(String [] args)
  {   
      Queue<Integer> q = new LinkedList<Integer>();
      q.add(2);
      q.add(10);
      q.add(15);
      q.add(100);
      q.add(23);
      q.add(44);
      System.out.println(q);
      q= max(q);
      System.out.println(q + " ****");
      //System.out.println(m);
               
  }
  public static Queue<Integer> max(Queue<Integer> q)
  {
    int max = 0;
    Queue<Integer> copy = new LinkedList<Integer>();
    while(!q.isEmpty())
    {
       int n = q.remove();
       if(n > max)
         max = n;
       copy.add(n);  
    }
    return copy;
  }
}