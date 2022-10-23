import java.util.*;


public class Test {
 

}

class A
{
   public void methodA()
   {
     System.out.println("A");
   }
   public void m()
   {
      System.out.println("In class A");
   }
}
class B extends A 
{
  public void m()
  { 
     System.out.println("Inside class B");
  }
}
class Driver
{
   public static void main(String[] args)
   {
     B b = new B();
     b.m();

;
   }
}
