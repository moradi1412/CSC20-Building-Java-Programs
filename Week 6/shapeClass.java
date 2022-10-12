/*Circle class extends the Shape class, Rectangle class extends the Shape class*/ 
public class shapeClass
{
   private double x;
   private double y;
   public shapeClass(double x, double y)
   {
      this.x = x;
      this.y = y;
   }
}
class Rectangle extends shapeClass
{
   private int width;
   private int length;
   public Rectangle(double x, double y, int width, int length)
   {
      super(x,y);
      this.width = width;
      this.length = length;
   }
}
class Circle extends shapeClass
{
   private double radius;
   public Circle(double x, double y, double radius)
   {
      super(x,y);
      this.radius = radius;
   }
}