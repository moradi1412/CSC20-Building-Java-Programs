interface Pay
{
   public double getRaise();
   public String getPromotion(double num);
}
class Secretary implements Pay
{
   public Secretary()
   {
   }
   public void getRaise()
   {
      System.out.println("You got a Raise");
   }
   public double getPromotion(int num)
   {
      System.out.println("You got " +num + " promotion");
   }
} 