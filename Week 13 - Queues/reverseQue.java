import java.util.*;
// import java.util.LinkedList;
// import java.util.Queue;
 import java.util.Stack;

public class reverseQue {
    
}
class Driver{
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>(); 
        q.add(2);
        q.add(10);
        q.add(15);
        q.add(23);
        q.add(44);
        
        System.out.println(q);
        //temporary storage to store from the queue 
        Stack<Integer> s = new Stack<Integer>();
        while (!q.isEmpty()){
            //add to the add from the queue method that remove the element from the q
            s.push(q.remove());
        }
        while (!s.isEmpty()){
            //removing from the stack and push back to the queue 
            q.add(s.pop()); 
        }
        System.out.println(q);
        

    }
}
