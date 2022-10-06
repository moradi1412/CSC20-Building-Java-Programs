package Inheritance;

//subclass  , or child class
public class Doctor extends Person
{
    //variable only for subclass 
   private String speciality;
   private String school;

   public Doctor(String first, String last, String ssn, int age, String speciality, String school)
   {
      
     //calling the constructor from the super class, it must be the first line of code in the subclass
     super(first,last,ssn,age);
     
     //initializing the specialized attributes
     this.speciality = speciality;
     this.school = school;
     
   }

   //getter method 
   public String getSpeciality()
   {
     return speciality;
   }
   public String getSchool()
   {
      return school;
   }
   public String toString()
   {
       String s = super.toString();
       s = s + "Speciality " + speciality;
       s = s + "\nSchool " + school;
       return s;
   }
}