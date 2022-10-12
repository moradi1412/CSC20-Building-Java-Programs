public class Point
{
  private double x;
  private double y;
  public Point()
  {
      x = 1;
      y = 1;
  }
  public Point (int x, int y){
    this.x = x; 
    this.y = y; 
  } 
  
  public boolean equals(Object o)
  {
     Point p = (Point) o; // type casting the object o to Point class so that we can compare the x and y
     return this.x == p.x && this.y == p.y;
  }
  
}
class Driver
{
  public static void main(String[] args)
  {
    Point p = new Point();  
    boolean b = p.equals("Hello"); //"Hello" is an object but not of Point type 
  }
}
