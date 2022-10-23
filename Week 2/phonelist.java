import java.util.*;
public class phonelist
{
  public static final int SIZE = 5;
  public static void main(String[] args)
  {
      run();
  }
  public static void run()
  {
     Scanner kb = new Scanner(System.in);
     String[] names = new String[SIZE];
     String[] phone = new String[SIZE];
     initialize(names, phone);
     boolean more = true;
     while(more)
     {
        System.out.print("Enter the name to look up the phone number: ");
        String friend = kb.nextLine();
        String contact = lookup(friend, names, phone );
        if (contact != null)
           System.out.println("The phone number for " + friend + " is " + contact);
        else
           System.out.println("Contact not found");
        System.out.print("\nDo you want to lok up another person? ");
        String answer = kb.nextLine();
        if(answer.equalsIgnoreCase("no"))
            more = false;     
     }   
  }
  //initialize the array of names and phone numbers
  public static void initialize(String[] names, String[] phone)
  {
     names[0] = "alex";
     phone[0] = "1234566789";
     names[1] = "mary";
     phone[1] = "9167779898";
     names[2] = "jose";
     phone[2] = "4445556666";
     names[3] = "nick";
     phone[3] = "3334445665";
     names[4] = "sara";
     phone[4] = "9998888778";
  }
  //returns the phone assosiated with the given name
  public static String lookup(String name, String[] names, String[] phone)
  {
      name = name.toLowerCase();
      for(int i = 0; i < names.length; i++)
      {
         if(names[i].equalsIgnoreCase(name))
             return phone[i];
      }
      return null;
  }
   }