import java.util.*;

public class addQueue {
    Queue<Integer> q = new LinkedList<Integer>();
    q.add(42);
    q.add(-3);
    q.add(17);       // front [42, -3, 17] back
System.out.println(q.remove());   // 42
    
}
