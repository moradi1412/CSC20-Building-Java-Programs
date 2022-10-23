public class Plate
{
    public void method1()
    {
      System.out.println("Plate");
    }
}
class Fork 
{
  public void method2()
  {
     System.out.println("Fork");
  }
}
class Spoon
{
   public void method3()
   {
      System.out.println("Spoon");
   }
}

class Driver
{
   public static void main(String[] args)
   {
     Object[] stuff = {new Spoon(), new Fork(), new Plate()};
     for(int i = 0; i < stuff.length; i++)
     {
         stuff[i].method1();
         Stuff[i].method2();
         stuff[i].method3();
     }
   }
}

class Driver
{
   public static void main(String[] args)
   {
     Object[] stuff = {new Spoon(), new Fork(), new Plate()};
     for(int i = 0; i < stuff.length; i++)
     {
         if(stuff[i] instanceof Plate)
         {
            Plate p = (Plate)stuff[i];
            p.method1();
         }
         else if(stuff[i] instanceof Fork)
         {
            Fork f = (Fork)stuff[i];
            f.method2();
         }
         else if(stuff[i] instanceof Spoon)
         {
            Spoon s = (Spoon)stuff[i];
            s.method3();
         }

    }
   }
}
