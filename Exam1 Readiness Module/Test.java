class Node
{
  public String title;
  public Node next;
  public Node(String title)
  {
     this.title = title;
  }
  public Node()
  {
    title = null;
  }
}

//********************************************

//A list of Nodes
class Movie
{
   Node front;
   public Movie(String title)
   {
      front = new Node(title);
   }

// add nodes to the list
   public void add(String s )
   {
     Node cur = front;
     while(cur.next!= null)
     {
       cur = cur.next;
     }
     Node n = new Node(s);
     cur.next = n;
     n.next = new Node(s);
   } 
   
}
class Driver
{
   public static void main(String[] args)
   {
     Movie list = new Movie("Trailer");
     list.add("Wizard");
     list.add("Vertigo");
     list.add("Godfather");
     list.add("Sunset"); 
     
     list.toString(); 
   }
}