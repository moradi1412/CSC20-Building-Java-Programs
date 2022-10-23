import java.util.*;
//Mohammad Javid Mordi 
//Self grading 100% 

public class InstaYourLastName {
   // no code here
}

class User implements Comparable {
   private String first;
   private String last;
   private String username;
   private boolean followBack;

   public User(String first, String last, String username, boolean followBack) {
      this.first = first;
      this.last = last;
      this.username = username;
      this.followBack = followBack;
   }

   // getter methods
   public String getFirst() {
      return first;
   }

   public String getLast() {
      return last;
   }

   public String getUsername() {
      return username;
   }

   public boolean getFollow() {
      return followBack; 
   }

   // setter method
   public void setFirst(String first) {
      this.first = first;
   }

   public void setLast(String last) {
      this.last = last;
   }

   // void methods
   public void unfollow() {
      followBack = false;
   }

   public void follow() {
      followBack = true;
   }

   public boolean equals(User other) {
      return this.username.equalsIgnoreCase(other.username);
   }

   public int compareTo(Object o) {

      User s = (User)o;
      return (this.username).compareTo(s.username);
   }

   public String toString() {

      if (followBack){
         return "UserName  : " + username +
            "\nFirstName : " + first +
            "\nLastName : " + last +
            "\nYou follow back this person" +
            "\n***********************************";
      } 
      return "UserName  : " + username +
      "\nFirstName : " + first +
      "\nLastName : " + last +
      "\nYou are not following this person" +
      "\n***********************************";
   }
}

class SocialMedia {
   private ArrayList<User> app;

   SocialMedia() {
      app = new ArrayList<User>();

   }

   public void followBack(String username) {
      for (int i = 0; i < app.size(); i++) {
         String s1 = app.get(i).getUsername(); 
         if (username.equalsIgnoreCase(s1)) {
            app.get(i).follow();
         }
      }
   }

   public boolean search(String first, String last) {

      {
         for (int i = 0; i < app.size(); i++) {
            if (first.equals(app.get(i).getFirst()) && last.equals(app.get(i).getLast()))
               return true;
         }
         return false;
      }
   }

   public boolean follow(String first, String last, String username, boolean followBack) {
      // creating a new object
      User a = new User(first, last, username, followBack);
      boolean userFound = search(first, last);
      boolean added = false;
      if (userFound) {
         // System.out.println("just for the purpose of search userfound = " +
         // userFound);
         return false;
      }
      if (app.size() == 0) {
         app.add(a);
         return true;
      }

      for (int j = 0; j < app.size(); j++) {
         if (a.compareTo(app.get(j)) < 0) {
            app.add(j,a);
            added = true;
            break;
         }
      }
      if (!added) {
         app.add(a);
         added = true;
      }
      return added;
   }

   /*
    * This method removes the person from the list meaning that they are not
    * following you
    * and you are not following them
    */
   public boolean remove(String first, String last) {
      {
         for(int i = 0; i < app.size(); i++)
         {
            if(app.get(i).getFirst().equals(first) && app.get(i).getLast().equals(last))
            {
               app.remove(i);
               System.out.println("succesfully removed");
               return true;
            }
         }
         return false;
      }
   }

   public ArrayList<User> getList() {
      return app;
   }

   public int followerCounts() {
      int followerCount = app.size(); 
      return followerCount;
   }

   public int followingCounts() {
      int follower = 0; 
      for (int i = 0; i < app.size(); i++) {
         if (app.get(i).getFollow() == true){ 
            follower++; 
         }
         
      }
      return follower;// must change
   }

   public String toString() {
      String s = "";

      for (int i = 0; i < app.size(); i++) {
         s = s + app.get(i).toString() + "\n";
      }
      return s;

   }
}
/* create your own driver here */
 class MyDriver
{
 public static void main(String[] args)
{
   SocialMedia myInsta = new SocialMedia();
   //adding memebers 
   myInsta.follow("Mohammad", "Javid", "mmoradi", true);
   myInsta.follow("Charles", "Dickens", "cDikens", false);
   myInsta.follow("Joe", "Regan", "JRegan", true);

   // printing the memebrs 
   System.out.println(myInsta);

   //removing a user 
   System.out.println("Removing Joe Regan from your followers list");
   myInsta.remove("Joe", "Regan");

   System.out.println("Adding Steve to your list of followers");
   myInsta.follow("Steve", "Jobs", "sJobs", true);

   //display the list without joe and add steve 
   System.out.println(myInsta);

   //displaying the follower count and following count 
   System.out.println("You are following " + myInsta.followerCounts() + "people");
   System.out.println("You have " + myInsta.followingCounts() + " followers");

 
   
}
}

/*
 * below is a sample driver. Do not remove this driver from your code when
 * sub,itting it
 */
class Driver {
   public static void main(String[] args) {
      SocialMedia myInsta = new SocialMedia();

      /* Adding followers to your list */
      /* the boolean field indicates whether you want to follow them back */
      // testing the search
      // myInsta.follow("Matthew", "Philips", "MatPhil", true);
      myInsta.follow("Matthew", "Philips", "MatPhil", true);
      myInsta.follow("Gary", "Kane", "GKane", false);
      myInsta.follow("Robert", "Kenny", "RKenny", true);
      myInsta.follow("Bill", "Fitch", "BillF", true);
      myInsta.follow("Trevor", "Schlulz", "TrevorS", false);

      /* Displaying your followers */
      System.out.println("Your followers informations\n");
      System.out.println(myInsta);

      /*Unfollowing a user*/
      System.out.println("Removing Robert Kenny from your followers list");
      myInsta.remove("Robert", "Kenny");

      /*Displaying the list*/
      System.out.println("List of followers after removing Robert Kenny");
      System.out.println(myInsta);

       /*adding a new follower*/
      System.out.println("Adding Elon Musk to your list of followers");
      myInsta.follow("Elon", "Musk", "ElonM", true);

      /*Dipslying the followers*/
      System.out.println("List of your followers:");
      System.out.println(myInsta);

      /*Searching for a follower*/
      System.out.println("Searching for Stonewall Jackson(StonW) in your followers list");
      if(myInsta.search("Jackson", "Stonewall") == false) {
         System.out.println("Stonewall Jackson is not in your list of followers");
         System.out.println("\n***************************");
         System.out.println("You are following " + myInsta.followerCounts() + "people");

         System.out.println("You have " + myInsta.followingCounts() + " followers");
         System.out.println(myInsta);
         Scanner kb = new Scanner(System.in);
         System.out.println("Enter the username of the person that you want to follow back: ");

         String username =kb.next();

         myInsta.followBack(username);

         System.out.println(myInsta);

   }
}
}