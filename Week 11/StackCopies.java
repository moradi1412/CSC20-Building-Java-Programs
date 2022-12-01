import java.util.Stack;

public class StackCopies {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<Integer>();

        s1.push(6);
        s1.push(3);
        s1.push(9);
        s1.push(0);
        s1.push(4);


        System.out.println(s1); 

        secret(s1);

        System.out.println("after" + s1); 
        
    }
   

    public static void secret(Stack<Integer> s)
{
      
     Stack<Integer> temp = new Stack<Integer>();
     while(!s.isEmpty())
     {
        int m = s.pop();
        if(m % 2 != 0)
        {
          for(int i = 0; i <= m/2; i++)
             temp.push(m);
           
        }
        else
        {
          temp.push(m);
        }
     }
     while(!temp.isEmpty())
     {
       s.push(temp.pop());
     }
      
   }
}

