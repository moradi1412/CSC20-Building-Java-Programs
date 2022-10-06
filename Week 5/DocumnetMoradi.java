import java.util.*;



public class DocumnetMoradi 
{
   //no code goes here. Must leave empty
}
class Document
{
   // private String content; 
   private String text; 

   //Constractor 
   public Document (String text){ //String text){
      this.text = text; 
      //this.text = text;
   }

   //getter method
   public String getContent(){
      return text; 
   }

   //setter method
   public void setContent(String text) {
      this.text = text;  
   }

   //toString method 
   public String toString()
   {
       String txt ; 
       txt = "Text:  " + text;
       return txt;
   }

   public int getLContentLength(){
     int count = text.length(); 
     return count; 
   }

   //Boolean for comparing keyword and content. 
   public boolean equals (String keyword){
      text.contains(keyword); 
      return true; 
   }
   public boolean equalsCotent (Document a){
      return this.text.equalsIgnoreCase(a.text); 
   }
}
 
 
class Email extends Document
{     
     private String sender; 
     private String recipient; 
     private String subject;
     private String cc;
     private boolean isSent; 
     //package to use the date 
     Date date = new Date(); 

     public Email (String text, String sender, String recipient, String subject, String cc){
      super(text); 
      //intial the rest of 
      this.sender = sender; 
      this.recipient = recipient; 
      this.subject = subject; 
      this.cc = cc;
     }
     //method for send 
     public void send (){
      isSent = true;   
     }
     //boolean for sent 
     public boolean getSent() {
      return isSent; 
     }

     //getter methods 
     public String getSender () {
      return sender; 
     }

     public String getRecipiant () {
      return recipient; 
     }

     public String getSubject () {
      return subject; 
     }
     public String getCC () {
      return cc; 
     }

     public String getdate(){ 
     String d; 
     d = date.toString();
     return d; 
     }

     //setter methods 
     public void setSender(String s){ 
      if(isSent == false){
      this.sender = s;
      }
      else 
      System.out.println("This email has been sent and cannot be modified");  
   }
      // methods to check for if email was sent. 
     public void setRecipient(String r){ 
      if(isSent == false){
      this.recipient = r;
      }
      else 
      System.out.println("This email has been sent and cannot be modified");  
   }
     public void setSubject(String r){ 
      if(isSent == false){
      this.subject = r;
      }
      else 
      System.out.println("This email has been sent and cannot be modified");  
   }
     public void modifyContent(String r){ 
      if(isSent == false){
      this.subject = r;
      }
      else 
      System.out.println("This email has been sent and cannot be modified");  
   }

   //to String method 
   public String toString()
   {
      String s = ""; 
       s = s + " Sender: " + sender;  
       s = s + "\n recipient " + recipient;
       s = s + "\n cc: " + cc;
       s = s + "\n subject " + subject;
       s = s + "\n Date: " + getdate(); 
       s = s + "\n Content " + super.toString();
       
       return s;
   }
   
   public Email forward (String rec, String sender,String cc){ 
   Email f = new Email (this.getContent(), sender, rec, this.subject, cc);
   f.date = new Date();
   f.isSent = true;
   return f; 
     
} 
}

//****************************************************************************************

//uncommnet this driver class once you have implemented the Documnet class and the Email class  
class EmailDriver
{
    // public Email(String text, String sender,String recipiant, String subject, String cc)
    public static void main(String[] args)
    {
      //creating an Email object
       Email e1 = new Email("Hello everyone, we will have a meeting tomorrow at 10", "Gita Faroughi","Alex","Meeting","");
      
       //sending the email
       e1.send();
       
       //disply the details about the email
       System.out.println(e1);
       System.out.println("\n\n");
       
       //searching the email for the email for the word tomorrow
       boolean b = e1.equals("tomorrow");
       if(b)
         System.out.println("The word tomorrow was  found in the email");
       else
          System.out.println("The word tomorrow was found in the email"); 
           
      
       //displaying just the content(text) of the email
       System.out.println("\nThe content of this email is: " + e1.getContent());
       System.out.println();
       //modifying the content of the email
       e1.modifyContent("bye");
       
       //changing the recipient of the e1 email
       e1.setRecipient("Jose@yahoo.com,Mary@gmail.com");
       System.out.println();
       
       //forwarding the email
       Email forward = e1.forward("Alex", "Gita" ,"Maria");
       System.out.println();
       
       //printing the forwarded email 
       System.out.println("forwarded message\n"+ forward);
       System.out.println();
       
       //display the length of the text in the email
      System.out.println("The number of the letters in the email is: " + e1.getLContentLength());
       
       //***********************************************************************
       //your turn, refer to the provided documnet on the codes you need to write
       
    }
   }