import java.util.*;

//Name : Mohammad Javid Moradi 
//Date : 10/12/2022 
// Application : Airplane with feature to add, remove , and display the passengers information (inheritance, inferences, instanceOf)


public class AirplaneMoradi {
   // no code goes here
}

class Person {
   private String firstName;
   private String lastName;
   private String phone;

   //Constructor 
   public Person(String fname, String lname, String phone) {
      this.firstName = fname;
      this.lastName = lname;
      this.phone = phone;
   }

   //toString method for superclass
   public String toString() {
      return "First Name: " + firstName +
            "\nLast Name: " + lastName +
            "\nPhone: " + phone;
   }

   //Boolean object model. 
   public boolean equals(Object o) {
      if (o instanceof Person) {
         Person p = (Person) o; // type casting the object o to Point class so that we can compare the x and y
         return this.lastName == p.lastName && this.firstName == p.firstName;
      }
      return false;
   }

   // setter methods
   public void setFirst(String name) {
      this.firstName = name;
   }

   public void setLast(String las) {
      this.firstName = las;
   }

   public void setPhone(String phone) {
      this.phone = phone;
   }

   // getter method
   public String getFirst() {
      return firstName;
   }

   public String getLast() {
      return lastName;
   }

   public String getPhone() {
      return phone;
   }

}

//Passenger subclass of Person 
class Passenger extends Person {

   private int seatNumber;
   private String classType;
   private String ticketId;

   public Passenger(String fname, String lname, String ticketId, int seatNumber, String classType, String phone) {
      //referrence to superclass, and getting these variable from superclass.
      super(fname, lname, phone);
      this.seatNumber = seatNumber;
      this.ticketId = ticketId;
      this.classType = classType;
   }

   // setter methods
   public void setClass(String classT) {
      this.classType = classT;
   }
   public void setTicketId(String ticketId) {
      this.ticketId = ticketId;
   }
 

   // getter method
   public String getClassType() {
      return classType;
   }
   public int getSeat() {
      return seatNumber;
   }
   public String getTicketId() {
      return ticketId;
   }

   public void changeSeatNumber(int num){
      this.seatNumber = num; 
   }

   //ToString Method 
   public String toString() {
      return "\n" + super.toString() +
             "\nSeat Number: " + seatNumber +
             "\nClass: " + classType +
            "\nTicketID " + ticketId + 
            "\n--------------"; 
   }
}

//Interface list 
interface list {
   public boolean add(Object o);

   public Object search(Object o);

   public boolean delete(Object o);

   public void printLast();

   public void takeOff();
}

class Airplane implements list {
   // declare the instance variable
   private Passenger[] passengers; 
   public static int count = 0; 
   private boolean takeOff = true; 
   private int planeNum; 

   // implement the constructor
   public Airplane(int planeNum ){ 
      passengers = new Passenger[30];
   } 

   public int getPlaneNumber (int n) {
      return planeNum;  
   }

   
   public int getCount(){
      return count; 
   }

   public Passenger[] getPassengers(){
      return passengers; 
   }

   public String toString(){
      return "String" ; 
   }

   public void print (){
      for (int i = 0; i < count; i++) {
         System.out.println(passengers[i]); 
      }

   }
   
   public boolean add(Object o) {
      if (takeOff){
       if (o instanceof Passenger){
        Passenger s = (Passenger)o; 
        passengers[count] = s;
        count++; 
        System.out.println("passenger added");
      }
      return false;
   }
   System.out.println("The plane has already taken off, passengers cannot board the plane.");
   return false; 
}

   public Object search(Object o) {
      boolean b = o instanceof String; 
      if(!b) 
      return null;
      String name = (String)o; 
      for(int i = 0; i < passengers.length; i++)
      {
       if(passengers[i]!= null && passengers[i].getLast().equalsIgnoreCase(name))
       { return passengers[i];   //returning the found object } 
      }
   }
   return null;//
   }

   public boolean delete(Object o) {
      // complete this method
      if (o instanceof String){
         String last = (String)o; 
         for (int i = 0 ; i < count; i++){
            if (passengers[i].getLast().equalsIgnoreCase(last)){
               passengers[i] = null; 
               return true; 
            }
         }
      }
      return false;
   }

   public void printLast() {
      for (int i = 0; i < count; i++) {
         System.out.println(passengers[i].getLast()); 
      }
      // complete this method
   }

   public void takeOff() {
      takeOff = false; 
      // complete this method
   }

}
/*
 * Do not delete the given driver , The class Driver must be in your code when
 * you submit it
 * Once you complete all the classes uncommnet the given driver to test your
 * code.
 */


class Driver {
 public static void main(String[]args) {
 Scanner in = new Scanner(System.in);
 Scanner kb = new Scanner(System.in);
 Airplane plane = new Airplane(817345);
 Passenger p1 = new Passenger("Bobbys", "Smith", "123456789", 1,"First class", "916-222-3333");
 Passenger p2 = new Passenger("Johnny", "Apples", "987654321", 8,"Business class", "818-000-1234");
 Passenger p3 = new Passenger("Tommy", "Jerrys", "567123489", 32,"Economy class","202-222-3333");
 Passenger p4 = new Passenger("Candy", "Cruze", "982134567", 15,"Premium Economy class","707-444-5555");
//this passenger will be added after take off
Passenger p5 = new Passenger("Kalotiii", "Aaronn", "762134589", 5,"Economy plus","817-222-6666");

plane.add(p1);
plane.add(p2);
plane.add(p3);
plane.add(p4);
System.out.println("This plane is about to take off");
plane.takeOff();
System.out.println("adding a passenger after take off");
plane.add(p5);
String repeat = "";
while(plane.getCount() > 0)
{

System.out.println("\nHere is the list of the passengers in this plane");
System.out.println("There are " + plane.getCount() +
" Passengers on this plane");
plane.print();
//System.out.println(plane + "\n");

System.out.println("Testing the printLast method to display the last names");
plane.printLast();
System.out.println();

System.out.println("Testing the static method getCount");
System.out.println("This train has " + plane.getCount() + " Passengers\n");

System.out.print("Enter the last name of the passenger to search for: ");
String lastName = in.nextLine();
System.out.println(plane.search(lastName));
System.out.println();

System.out.println("Testing the delete method");
System.out.print("Enter the last name of the passenger to be deleted: ");
String last = in.nextLine();
plane.delete(last);
System.out.println("Passenger " + last +
" has been removed from the list\n");
System.out.println("Here is the updated list");

//System.out.println(passengers);
plane.print();
System.out.println("*********************");
System.out.print("Press any key to continue : ");
repeat = kb.nextLine();
}
System.out.println("No passenger left on this airplane");
}
}
 
/* Complete the following driver to include the required code. */
/* 20 points is allocated for this driver */
class yourDriver {
}
