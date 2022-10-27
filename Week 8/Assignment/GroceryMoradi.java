import java.util.*;
public class GroceryMoradi //<------ change this name to include your last name
{
   //no code goes here
}
class Item implements Comparable<Object>{
   //list of the instance variables
   
   
   
   // constructor	
   Item(String name, double price, String expDate, String barcode){
       
   }
	
   public String getName() {
      return "";
   }
   public double getPrice() {
      return 0;
   }
   public String getExpDate() {
      return "";
   }
   public String getBarcode()
   {
      return "";
   }
   public void setName(String name) {
       
   }
   public void setPrice(double price) {
      
   }
   public void setExpDate(String expDate) {
       
   }
   public void setBarcode()
   {
       
   }
   //compare the two objects for equality based on the barcode of the object	
   public boolean equals(Object o) {
   
      return false;
   }
   /* compare the two objects baned on the name of the objects, if the names are the same then compare based on
   the barcode*/	
   public int compareTo(Object o) {
   
      return 0;
   }
   /* cretae a string representing the item object and returns it*/	
   public String toString() {
      return  "";
   }
	
}

class ListNode{
   private Item item;
   private ListNode next;
	
   public ListNode()
   {
   }
   public ListNode(Item item) {
      this.item = item;
   }
   public ListNode(Item item, ListNode next) {
      this.item = item;
      this.next = next;
   }

     
  
   //getter methods  	
  
  
   //setter method   
   	
}

interface List{
   public void add(String food, double price, String expDate, String barcode);
   public void add(int index, String name, double price, String expDate, String barcode);
   public int indexOf(String barcode);
   public Item remove(String barcode);
   public int getSize();
   public String toString();
   public Item get(int index);
   public Item mostExpensive();
   public Item leastExpensive();
}

class GroceryList implements List{
  //instance variables
   private ListNode head;
   public static int size = 0;
 
   //constructor	
   public GroceryList() {
      head = null;
   }
   //constructor	
   public GroceryList(Item i) {
      head = new ListNode(i);
      size++;
   }
   /* This method creates an Item object, finds the end of the list and adds it to the ende*/	
   public void add(String name, double price, String expDate, String barcode)
   {
   }

   /* creates an item object, finds the given index, adds the item at the given index*/	
   public void add(int index, String name, double price, String expDate, String barcode) {
       
   }
   	
         	
   /*searches the list for the given barcode and returns the index of the item with the given barcode*/   	
   public int indexOf(String barcode) {
      return 0;
   }

   /* searches the list for the given barcode, removes the item from the list and returns the removed item*/	
   public Item remove(String barcode) {
      return null;           	
   }

   /*returns the size of the list*/	
   public int getSize() {
      return 0;
   }
  /*goes through the list, calls the toString method on each item in the list, returns a String representing all
  the objects in the list*/	
   public String toString() {
      return ""; 
   }
   /* returns the item at the given index, goes through the list, finde the given index, returns the item at the index*/	
   public Item get(int index) {
      return null;
   }
   
   /*Returns the most expensive item in the list. goes through the list and finds the expensive one
   This is very similar to the least expensive method*/
   public Item mostExpensive() {
      return null;
              
   }
      
       
   
   /* returns the least expensive item in the list
   Some code along with commnets  is provided
   follow the commnets to complete the code*/
   public Item leastExpensive()
   {
      if(head == null) 
      {
         return null;
      }
      else
      {
         //make a copy of the head node
         ListNode curr = head;
         
         //declare a variable of type Item set it to null
         Item leastExpensive = null;
         
         //declare a variable for the price set it to  a max value
         double price = Integer.MAX_VALUE;
         
      	//while curr is not null
         { 
             //if the price of the item at the curr node is less than the price 
            {
            
               //set the leastexpensive to the ittem at the current node
                
               //set the price to the price of the item at the curr node
                
            }//end if
            
            // curr should be assigned to curr.getNext() 
            
             
         }//end while
       
       return leastExpensive;
      }  
   
   }
/*implement your own driver similar to the given driver. DO NOT REMOVE THE GIVEN DRIVER*/
   class yourDriver
   {
   }

   class Driver {
      public static void main(String []args) {
         Scanner kb = new Scanner(System.in);
         GroceryList list = new GroceryList();
      
         list.add("Chicken", 5.99, "3/20/2022", "1234567890");
         list.add("Chocolate", 3.99, "2/1/2002", "22334455667788");
         list.add("Icecream", 2.99, "12/30/2025", "125467890");
         list.add("Steak", 35.50, "8/15/2030", "78956223445");
      
         boolean repeat = true;
         while (true)
         {
         
            System.out.println("Here is the list of food items");
            System.out.println(list);
            System.out.println("**************************************");	
            System.out.println("Here is the most expensive item on the list");
            System.out.println(list.mostExpensive());
            System.out.println("**************************************");
            System.out.print("Enter the barcode of the item to remove from the list: ");
            String barcode = kb.next();	
         // System.out.println("Removing Milk from the list and adding a new expensive item on the list in the 2nd node");
            Item i = list.remove(barcode);
            if (i != null)
               System.out.println("This item has been void: \n" + i);
            else
               System.out.println("This item is not in the list");  
            System.out.println("**************************************");
            System.out.println("enter the info for the item to add it to the list ");
            System.out.println("index must be in the range 0 - " + (list.getSize()-1));
            System.out.print("Index -> ");
            int index = kb.nextInt(); 
            System.out.print("name --> ");
            String name = kb.next();
            System.out.print("Price --> " );
            double price = kb.nextDouble();
            System.out.print("Expiration date --> " );
            String date = kb.next();
            System.out.print("barcode--> " );
            barcode = kb.next();   
            list.add(index, name, price, date, barcode);
            System.out.println("**************************************");
            System.out.println("Here is the items in your list: ");
            System.out.println(list);
            System.out.println("**************************************");
         
            System.out.println("Testing the mostExpensive method to see what is the most expensive item now");
            System.out.println(list.mostExpensive());
            System.out.println("**************************************");
            System.out.println("Testing the leastExpensive method to see what is the most expensive item now");
            System.out.println(list.leastExpensive());
            System.out.println("**************************************");
         
            System.out.println("Enter the index of the item in the list(list is zero based) to display the item");
            System.out.println("index must be in the range 0 - " + (list.getSize()-1));
            System.out.print("Index --> " );
         
            index = kb.nextInt();	
            System.out.println("Here is the item at the index " + index);
            System.out.println(list.get(index));
            System.out.println("**************************************");
            kb.nextLine();
            System.out.println("Press any key to continue");
            kb.nextLine();
         } 
      } 
   	
   }}
