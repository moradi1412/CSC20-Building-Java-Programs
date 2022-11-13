import java.util.ArrayList;
import java.util.Stack;

public class Stack {
    
    private ArrayList<Object> list; 
    private int top = 0; 


    public Stack(){ 
        list = new ArrayList<Object>(); //intizaling the list  
    }

    public Object pop(){
        if (!isEmpty()){
            Object o = list.get (top - 1 ); 
            list.remove(top - 1); 
            top--; 
            return o; 
        }
        return null; 
    }

    public void push(Object o){
        list.add(o); 
        top++; 
    }

    //to check if the stack is empty 
    public boolean isEmpty(){
        return list.size() == 0 ; 
    }

    public Object peek(){
        if (!isEmpty()){
            return list.get(top -1 ); 
        }
        return null; 
    }

    public String toString(){
        return list.toString(); 
    }
}

class Driver {
    public static void main(String[] args) {
     Stack myStack = new Stack(); //Creating a new stack 
     myStack.push(new Integer(5));    
     myStack.push(new Integer(15));    
     myStack.push(new Integer(20));    
     myStack.push(new Integer(25));    
     myStack.push(new Integer(30));   
     System.out.println(myStack);
     System.out.println(myStack.pop());
     System.out.println(myStack.pop());
     System.out.println(myStack);      
    }
}