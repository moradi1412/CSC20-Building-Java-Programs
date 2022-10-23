//type casting method 
public class Cup extends Box {
    public void method1() {
        System.out.println("Cup 1");
    }

    public void method2() {
        System.out.println("Cup 2");
        super.method2();
    }
    public void method3() {
        System.out.println("Cup 3");
        super.method2();
    }
}

 class Pill {
    public void method2() {
        System.out.println("Pill 2");
    }
}

class Jar extends Box {
    public void method1() {
        System.out.println("Jar 1");
    }

    public void method2() {
        System.out.println("Jar 2");
    }
}

class Box extends Pill {
    public void method2() {
        System.out.println("Box 2");
    }

    public void method3() {
        method2();
        System.out.println("Box 3");
    }
}
class Driver
{
  public static void main(String[] args)
  {
      Box var1 = new Box();
      Pill var2 = new Jar();
      Box var3 = new Cup();
      Box var4 = new Jar();
      Object var5 = new Box();
      Pill var6 = new Pill();
      var1.method2();
      var2.method2();
      var3.method2();
      var4.method2();

      //error becuase object doesn't have method2 
      //to fix neeeded to be typecast. 
      var5.method2();  //error

      ((box)var6).method2();
      var1.method3();

      //method3 doesn't exist in class pill 
      //the only way is to add method3 to pill class. 
      var2.method3();//error
      var3.method3();
      var4.method3();

      //just removing the type casting 
      //((Cup)var1).method1(); //runtime error
        var1.method1();

      ((Jar)var2).method1();
      ((Cup)var3).method1();
        var4.method1(); //runtime error
      ((Jar)var4).method2();
      ((Box)var5).method2();
      //object to pill and call method 3 
      ((Pill)var5).method3();//error
      ((Jar)var2).method3();
      ((Cup)var3).method3();

     // ((Cup)var5).method3();//runtime error
      ((Cup)var5).method3();//runtime error
      

  }
}
