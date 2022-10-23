public class Car {
    public void m1() {
        System.out.println("car 1");
    }
​
    public void m2() {
        System.out.println("car 2");
    }
​
    public String toString() {
        return "vroom";
    }
}
class Truck extends Car {
    public void m1() {
        System.out.println("truck 1");
    }
     
    public void m2() {
        super.m1();
    }
     
    public String toString() {
        return super.toString() + super.toString();
    }
}
class MonsterTruck extends Truck
{
  public void m1()
  {
     System.out.println("Monster 1");
  }
  public void m2()
  {
     super.m1();
     super.m2();
  }
  public String toString()
  {
     return "Monster "+ super.toString();
  }
   } 
class Driver
{
  public static void main(String[]args)
  {
     MonsterTruck m = new MonsterTruck();
     m.m1();
     m.m2();
     System.out.println(m);
     
  }
}